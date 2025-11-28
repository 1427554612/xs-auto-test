package com.xs.auto.test.ui_auto_test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xs.auto.test.commom.R;
import com.xs.auto.test.ui_auto_test.entity.TestCase;
import com.xs.auto.test.ui_auto_test.mapper.TestCaseMapper;
import com.xs.auto.test.ui_auto_test.services.TestCaseService;
import com.xs.auto.test.ui_auto_test.vo.RunCaseVo;
import com.xs.auto.test.web.websocket.WebSocketController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ui自动化测试类
 */
@RestController
@RequestMapping("/uitest/testcase")
public class TestCaseController {

    @Autowired
    TestCaseService testCaseService;

    @Autowired
    TestCaseMapper testCaseMapper;

    @Autowired
    WebSocketController webSocketController;

    @Autowired
    ObjectMapper objectMapper;


    @GetMapping("/websocket")
    public R testWebsocket() throws IOException {
        System.out.println(" webSocketController =" + webSocketController);
        Map<String,String> sendMap = new HashMap<>();
        sendMap.put("title","你好呀"+ System.currentTimeMillis());
        sendMap.put("time",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        sendMap.put("status","wait");
        webSocketController.sendToClient("zhangjun",objectMapper.writeValueAsString(sendMap));
        return R.ok();
    }
    /**
     * 新增测试用例
     */
    @PostMapping
    public R save(@Validated @RequestBody TestCase testCase) {
        testCase.setCreateTime(LocalDateTime.now());
        testCase.setUpdateTime(LocalDateTime.now());
        int result = testCaseMapper.insert(testCase);
        return result==1 ? R.ok() : R.error();
    }

    /**
     * 根据ID删除测试用例
     */
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id) {
        int result = testCaseMapper.deleteById(id);
        return result==1 ? R.ok() : R.error();
    }

    /**
     * 批量删除测试用例
     */
    @DeleteMapping("/batch")
    public R deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return R.error();
        }
        int result = testCaseMapper.deleteBatchIds(ids);
        return result >1 ? R.ok() : R.error();
    }

    /**
     * 更新测试用例
     */
    @PutMapping
    public R update(@Validated @RequestBody TestCase testCase) {
        if (testCase.getId() == null) {
            return R.error();
        }
        testCase.setUpdateTime(LocalDateTime.now());
        int result = testCaseMapper.updateById(testCase);
        return result==1 ? R.ok() : R.error();
    }


    /**
     * 两种测试模式
     *      1、单测试类，可选择具体方法
     *      2、多测试类，可选择具体方法
     */
    @PostMapping("/run")
    public R run(@RequestBody RunCaseVo runCaseVo) throws Exception {
        return  testCaseService.run(runCaseVo) ==true ?  R.ok():R.error();
    }

    @GetMapping("/methods/{classId}")
    public R getRunCaseMethod(@PathVariable String classId){
        List<String> methods = testCaseService.getRunCaseMethod(classId);
        return R.ok().data("list",methods);
    }

    /**
     * 根据ID查询测试用例
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        return testCaseMapper.selectById(id) == null ? R.ok():R.error();
    }

    /**
     * 查询所有测试用例列表
     */
    @GetMapping("/list")
    public R list() {
        List<TestCase> list = testCaseMapper.selectList(null);
        return R.ok().data("list",list);
    }


    @GetMapping("/page")
    public R page(
            @RequestParam(defaultValue = "1") Integer current,
            @RequestParam(defaultValue = "10") Integer size,
            @RequestParam(required = false) String className,
            @RequestParam(required = false) Integer caseType,
            @RequestParam(required = false) Integer isMain) {
        Page<TestCase> page = new Page<>(current, size);
        QueryWrapper<TestCase> queryWrapper = new QueryWrapper<>();

        if (className != null && !className.isEmpty()) {
            queryWrapper.like("class_name", className);
        }
        if (caseType != null) {
            queryWrapper.eq("case_type", caseType);
        }
        if (isMain != null) {
            queryWrapper.eq("is_main", isMain);
        }
        queryWrapper.orderByDesc("update_time");
        IPage<TestCase> list = testCaseMapper.selectPage(page, queryWrapper);
        return R.ok().data("total",list.getTotal()).data("current",list.getCurrent()).data("list",list.getRecords());
    }

}
