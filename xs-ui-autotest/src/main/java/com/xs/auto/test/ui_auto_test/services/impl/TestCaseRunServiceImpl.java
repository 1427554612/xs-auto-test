package com.xs.auto.test.ui_auto_test.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.ui_auto_test.entity.TestCaseRun;
import com.xs.auto.test.ui_auto_test.mapper.TestCaseRunMapper;
import com.xs.auto.test.ui_auto_test.services.TestCaseRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 测试用例运行记录表 服务实现类
 * </p>
 */
@Service
public class TestCaseRunServiceImpl extends ServiceImpl<TestCaseRunMapper, TestCaseRun> implements TestCaseRunService {

    @Autowired
    private TestCaseRunMapper testCaseRunMapper;

    @Override
    @Transactional
    public void syncAllTestCaseRunStats() {
        // 先清空表
        testCaseRunMapper.truncateTestCaseRun();
        // 再全量同步
        testCaseRunMapper.syncTestCaseRunStats();
    }

    @Override
    @Transactional
    public void syncTestCaseRunStatsByCaseIds(List<Integer> caseIds) {
        if (caseIds != null && !caseIds.isEmpty()) {
            testCaseRunMapper.syncTestCaseRunStatsByCaseIds(caseIds);
        }
    }


    @Override
    @Transactional
    public void clearTestCaseRunStats() {
        testCaseRunMapper.truncateTestCaseRun();
    }
}