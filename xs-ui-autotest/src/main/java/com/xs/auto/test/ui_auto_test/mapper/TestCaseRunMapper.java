package com.xs.auto.test.ui_auto_test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xs.auto.test.ui_auto_test.entity.TestCaseRun;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 测试用例运行记录表 Mapper 接口
 * </p>
 */
@Mapper
public interface TestCaseRunMapper extends BaseMapper<TestCaseRun> {
    /**
     * 同步测试用例运行统计信息
     */
    void syncTestCaseRunStats();

    /**
     * 根据caseId列表同步测试用例运行统计信息
     */
    void syncTestCaseRunStatsByCaseIds(@Param("caseIds") List<Integer> caseIds);

    /**
     * 清空test_case_run表数据
     */
    void truncateTestCaseRun();
}