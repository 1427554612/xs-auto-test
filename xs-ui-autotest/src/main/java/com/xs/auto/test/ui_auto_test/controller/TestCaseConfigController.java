package com.xs.auto.test.ui_auto_test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xs.auto.test.commom.R;
import com.xs.auto.test.ui_auto_test.entity.TestCaseConfig;
import com.xs.auto.test.ui_auto_test.mapper.TestCaseConfigMapper;
import com.xs.auto.test.ui_auto_test.services.TestCaseConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/test-case-config")
public class TestCaseConfigController {

    @Autowired
    private TestCaseConfigService testCaseConfigService;

    /**
     * 分页查询
     */
    @GetMapping("/page/{current}/{size}")
    public R page(
            @PathVariable(name = "current") Integer current,
            @PathVariable(name = "size") Integer size) {

        // 创建分页对象
        Page<TestCaseConfig> page = new Page<>(current, size);

        // 创建查询条件
        QueryWrapper<TestCaseConfig> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("update_time");

        // 执行分页查询
        IPage<TestCaseConfig> testCaseConfigIPage = testCaseConfigService.page(page, wrapper);

        // 返回结果 - 直接从分页对象获取所有信息
        return R.ok()
                .data("total", testCaseConfigIPage.getTotal())
                .data("current", testCaseConfigIPage.getCurrent())
                .data("size", testCaseConfigIPage.getSize())
                .data("list", testCaseConfigIPage.getRecords());
    }

    /**
     * 根据ID查询
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        return R.ok().data("data",testCaseConfigService.getById(id));
    }

    /**
     * 新增
     */
    @PostMapping
    public R save(@RequestBody TestCaseConfig testCaseConfig) {
        testCaseConfig.setCreateTime(LocalDateTime.now());
        testCaseConfig.setUpdateTime(LocalDateTime.now());
        return testCaseConfigService.save(testCaseConfig) ? R.ok():R.error();
    }

    /**
     * 修改
     */
    @PutMapping
    public R update(@RequestBody TestCaseConfig testCaseConfig) {
        testCaseConfig.setUpdateTime(LocalDateTime.now());
        return testCaseConfigService.updateById(testCaseConfig) ? R.ok() : R.error();
    }

    /**
     * 删除
     */
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id) {
        return testCaseConfigService.removeById(id) ? R.ok():R.error();
    }

    /**
     * 更新状态
     */
    @PutMapping("/status/{id}/")
    public Boolean updateStatus(@PathVariable Integer id, @PathVariable Integer status) {
        TestCaseConfig config = new TestCaseConfig();
        config.setId(id);
        config.setStatus(status);
        config.setUpdateTime(LocalDateTime.now());
        return testCaseConfigService.updateById(config);
    }

    /**
     * 更新状态
     */
    @GetMapping("/list")
    public R list() {
        return R.ok().data("list",testCaseConfigService.list(null));
    }
}