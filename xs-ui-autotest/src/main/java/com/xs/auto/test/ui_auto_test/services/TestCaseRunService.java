package com.xs.auto.test.ui_auto_test.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xs.auto.test.ui_auto_test.entity.TestCaseRun;

import java.util.List;

/**
 * <p>
 * 测试用例运行记录表 服务类
 * </p>
 */
public interface TestCaseRunService extends IService<TestCaseRun> {

    /**
     * 全量同步测试用例运行统计
     */
    void syncAllTestCaseRunStats();

    /**
     * 根据caseId列表同步测试用例运行统计
     */
    void syncTestCaseRunStatsByCaseIds(List<Integer> caseIds);


    /**
     * 清空统计表
     */
    void clearTestCaseRunStats();
}