package com.xs.auto.test.ui_auto_test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xs.auto.test.commom.R;
import com.xs.auto.test.ui_auto_test.entity.TestCaseConfig;
import com.xs.auto.test.ui_auto_test.entity.TestCaseRun;
import com.xs.auto.test.ui_auto_test.entity.TestCaseRunInfo;
import com.xs.auto.test.ui_auto_test.services.TestCaseConfigService;
import com.xs.auto.test.ui_auto_test.services.TestCaseRunInfoService;
import com.xs.auto.test.ui_auto_test.services.TestCaseRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.MediaSize;
import java.util.List;

/**
 * <p>
 * 测试用例运行记录表 前端控制器
 * </p>
 */
@RestController
@RequestMapping("/test-case-run")
public class TestCaseRunController {

    @Autowired
    private TestCaseRunService testCaseRunService;

    @Autowired
    private TestCaseRunInfoService testCaseRunInfoService;

    @Autowired
    private TestCaseConfigService testCaseConfigService;

    /**
     * 获取所有列表
     */
    @PostMapping("/list/{current}/{size}")
    public R list(@PathVariable(name = "current") Integer current,@PathVariable(name = "size") Integer size) {
        List<TestCaseRun> list = testCaseRunService.list();
        for (TestCaseRun testCaseRun : list) {
            TestCaseConfig testConfig = testCaseConfigService.getById(testCaseRun.getLastRunConfigId());
            testCaseRun.setConfigName(testConfig.getConfigName());
        }
        return R.ok().data("list",list);
    }

    /**
     * 获取详情列表
     * @return
     */
    @PostMapping("/info/list/{methodName}/{current}/{size}")
    public R resultInfoListByName(@PathVariable(name = "methodName") String methodName,
                                  @PathVariable(name = "current") Integer current,
                                  @PathVariable(name = "size") Integer size){
        List<TestCaseRunInfo> testCaseRunInfos = testCaseRunInfoService.findListByMethodName(methodName,current,size);
        return R.ok().data("list",testCaseRunInfos);
    }

    /**
     * 根据caseId列表同步
     */
    @PostMapping("/sync/by-case-ids")
    public String syncByCaseIds(@RequestBody List<Integer> caseIds) {
        testCaseRunService.syncTestCaseRunStatsByCaseIds(caseIds);
        return "同步完成";
    }


    /**
     * 清空统计表
     */
    @DeleteMapping("/clear")
    public String clearStats() {
        testCaseRunService.clearTestCaseRunStats();
        return "清空完成";
    }
}