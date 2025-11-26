package com.xs.auto.test.ui_auto_test.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.microsoft.playwright.Page;
import com.xs.auto.test.commom.XsException;
import com.xs.auto.test.ui_auto_test.core.TestRunHandle;
import com.xs.auto.test.ui_auto_test.entity.PoClass;
import com.xs.auto.test.ui_auto_test.entity.TestCase;
import com.xs.auto.test.ui_auto_test.entity.TestCaseConfig;
import com.xs.auto.test.ui_auto_test.groovy.GroovyScriptExecutor;
import com.xs.auto.test.ui_auto_test.log.WebsocketLogFactory;
import com.xs.auto.test.ui_auto_test.mapper.PoClassMapper;
import com.xs.auto.test.ui_auto_test.mapper.TestCaseConfigMapper;
import com.xs.auto.test.ui_auto_test.mapper.TestCaseMapper;
import com.xs.auto.test.ui_auto_test.services.TestCaseRunService;
import com.xs.auto.test.ui_auto_test.services.TestCaseService;
import com.xs.auto.test.ui_auto_test.vo.RunCaseVo;
import com.xs.auto.test.web.api.FtpServerApi;
import com.xs.auto.test.web.websocket.WebSocketController;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 * 测试用例表 服务实现类
 * </p>
 *
 * @author author
 * @since 2023-08-08
 */
@Service
public class TestCaseServiceImpl extends ServiceImpl<TestCaseMapper, TestCase> implements TestCaseService {

    /**
     * 执行测试用例
     * @param poClass
     * @return
     */
    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    PoClassMapper poClassMapper;
    @Autowired
    TestCaseConfigMapper testCaseConfigMapper;

    @Autowired
    TestCaseRunService testCaseRunService;

    @Autowired
    WebSocketController webSocketController;

    @DubboReference
    public FtpServerApi ftpServerApi;


    @Override
    public boolean run(RunCaseVo runCaseVo) throws Exception {
        // 获取websocket所有链接用户
        //TODO 前端整合websocket客户端后修改：String name = runCaseVo.getName(); ，隐藏 String name = "zhangjun";
        String name = "zhangjun";
        Set<String> connectedClients = WebSocketController.getConnectedClients();
        List<String> collect = null;
        if (connectedClients.size()!=0){
            collect = connectedClients.stream().filter(userName -> name.equals(userName)).collect(Collectors.toList());
        }
        String finalUserName = collect.get(0);
        if (finalUserName == null){
            throw new XsException(20001,"websocket链接数为0");
        }
        WebsocketLogFactory websocketLogFactory = new WebsocketLogFactory(TestCaseServiceImpl.class,webSocketController,finalUserName);
        // 清空之前的日志
        websocketLogFactory.clearLogs();
        websocketLogFactory.info("-----------------开始执行ui自动化测试工作-----------------");
        websocketLogFactory.info("当前链接对象为：" + finalUserName);
        // 获取测试配置
        TestCaseConfig testCaseConfig = testCaseConfigMapper.selectById(runCaseVo.getConfigId());
        String url = (String)testCaseConfig.getConfigContext().get("url");
        websocketLogFactory.info("执行的url为：" + url);
        // 创建唯一的 Page 对象
        TestRunHandle testRunHandle = new TestRunHandle();
        Page page = testRunHandle.initPage(url);
        websocketLogFactory.info("page对象已创建......" + page);
        List<PoClass> poClasses = poClassMapper.selectList(null);
        TestCase testCase = baseMapper.selectById(runCaseVo.getId());
        websocketLogFactory.info("查询出的测试用例类......" + testCase.getClassName());
        LinkedHashMap<String, String> objectObjectLinkedHashMap = new LinkedHashMap<>();
        for (PoClass aClass : poClasses) {
            objectObjectLinkedHashMap.put(aClass.getClassName(),aClass.getCode());
        }
        // 先查找父类case对象
        QueryWrapper<TestCase> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("class_name","BaseTestCase");
        TestCase parentTestCase = baseMapper.selectOne(queryWrapper);
        objectObjectLinkedHashMap.put(parentTestCase.getClassName(),parentTestCase.getCode());
        //在查找子类case对象
        objectObjectLinkedHashMap.put(testCase.getClassName(),testCase.getCode());
        List<RunCaseVo> runCaseVos = Arrays.asList(runCaseVo);
        GroovyScriptExecutor executor = new GroovyScriptExecutor(
                applicationContext,
                webSocketController,
                objectObjectLinkedHashMap,
                runCaseVos,
                testCase,testCaseConfig,finalUserName);

        try {
             // 传入 Page 对象
             Object o = executor.executeScripts(page);
        }catch (Exception  | Error error){
            error.printStackTrace();
        }
        finally {
            executor.close();
            testRunHandle.close();
            websocketLogFactory.info("资源已清理-----------------");
        }
        websocketLogFactory.info("-----------------自动化测试工作已结束-----------------");
        testCaseRunService.syncAllTestCaseRunStats();
        return true;
    }

    /**
     * 获取要执行的类的所有测试方法
     * @param classId
     * @return
     */
    @Override
    public List<String> getRunCaseMethod(String classId) {
        TestCase testCase = baseMapper.selectById(classId);
        GroovyScriptExecutor executor = new GroovyScriptExecutor();
        return (List<String>)executor.getClassMethods(testCase);
    }



}
