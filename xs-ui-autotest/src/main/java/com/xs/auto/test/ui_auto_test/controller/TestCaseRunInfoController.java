package com.xs.auto.test.ui_auto_test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xs.auto.test.commom.R;
import com.xs.auto.test.ui_auto_test.entity.TestCaseRunInfo;
import com.xs.auto.test.ui_auto_test.services.TestCaseRunInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uitest/test-result")
public class TestCaseRunInfoController {

    @Autowired
    private TestCaseRunInfoService testCaseRunInfoService;

    /**
     * 新增测试用例运行信息
     */
    @PostMapping
    public Boolean save(@RequestBody TestCaseRunInfo testCaseRunInfo) {
        return testCaseRunInfoService.save(testCaseRunInfo);
    }

    /**
     * 修改测试用例运行信息
     */
    @PutMapping
    public Boolean update(@RequestBody TestCaseRunInfo testCaseRunInfo) {
        return testCaseRunInfoService.updateById(testCaseRunInfo);
    }

    /**
     * 根据ID删除测试用例运行信息
     */
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return testCaseRunInfoService.removeById(id);
    }

    /**
     * 根据ID查询测试用例运行信息
     */
    @GetMapping("/{id}")
    public TestCaseRunInfo getById(@PathVariable Integer id) {
        return testCaseRunInfoService.getById(id);
    }

    /**
     * 查询所有测试用例运行信息
     */
    @GetMapping("/list")
    public R list() {
        QueryWrapper<TestCaseRunInfo> queryWrapper = new QueryWrapper();
        queryWrapper.orderByDesc("start_time");
        return R.ok().data("list",testCaseRunInfoService.list(queryWrapper));
    }

    /**
     * 分页查询测试用例运行信息
     */
    @GetMapping("/page")
    public Page<TestCaseRunInfo> page(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize) {
        return testCaseRunInfoService.page(new Page<>(pageNum, pageSize));
    }

    /**
     * 根据用例ID查询运行信息
     */
    @GetMapping("/by-case-id/{caseId}")
    public List<TestCaseRunInfo> getByCaseId(@PathVariable Integer caseId) {
        QueryWrapper<TestCaseRunInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("case_id", caseId)
                .orderByDesc("start_time");
        return testCaseRunInfoService.list(wrapper);
    }

    /**
     * 根据类名查询运行信息
     */
    @GetMapping("/by-class-name")
    public List<TestCaseRunInfo> getByClassName(@RequestParam String className) {
        QueryWrapper<TestCaseRunInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("class_name", className)
                .orderByDesc("start_time");
        return testCaseRunInfoService.list(wrapper);
    }

    /**
     * 根据执行结果查询运行信息
     */
    @GetMapping("/by-result/{runResult}")
    public List<TestCaseRunInfo> getByRunResult(@PathVariable Integer runResult) {
        QueryWrapper<TestCaseRunInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("run_result", runResult)
                .orderByDesc("start_time");
        return testCaseRunInfoService.list(wrapper);
    }

    /**
     * 查询最近的运行记录
     */
    @GetMapping("/recent/{limit}")
    public List<TestCaseRunInfo> getRecentRecords(@PathVariable Integer limit) {
        QueryWrapper<TestCaseRunInfo> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("start_time")
                .last("LIMIT " + limit);
        return testCaseRunInfoService.list(wrapper);
    }
}
