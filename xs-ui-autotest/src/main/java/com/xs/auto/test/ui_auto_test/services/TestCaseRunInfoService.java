package com.xs.auto.test.ui_auto_test.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xs.auto.test.ui_auto_test.entity.TestCaseRunInfo;

import java.util.List;

/**
 * <p>
 * 测试用例运行信息表 服务类
 * </p>
 *
 * @author author
 * @since 2023-08-08
 */
public interface TestCaseRunInfoService extends IService<TestCaseRunInfo> {

    /**
     * 以方法名称查询列表
     * @param methodName
     * @param current
     * @param size
     * @return
     */
    List<TestCaseRunInfo> findListByMethodName(String methodName, Integer current, Integer size);
}
