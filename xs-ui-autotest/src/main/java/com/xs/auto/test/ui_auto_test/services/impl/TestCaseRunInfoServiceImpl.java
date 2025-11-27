package com.xs.auto.test.ui_auto_test.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.ui_auto_test.entity.TestCaseRunInfo;
import com.xs.auto.test.ui_auto_test.mapper.TestCaseRunInfoMapper;
import com.xs.auto.test.ui_auto_test.services.TestCaseRunInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 测试用例运行信息表 服务实现类
 * </p>
 *
 * @author author
 * @since 2023-08-08
 */
@Service
public class TestCaseRunInfoServiceImpl extends ServiceImpl<TestCaseRunInfoMapper, TestCaseRunInfo> implements TestCaseRunInfoService {

    @Override
    public List<TestCaseRunInfo> findListByMethodName(String methodName, Integer current, Integer size) {
        QueryWrapper<TestCaseRunInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("method_name",methodName);
        queryWrapper.orderByDesc("start_time");
        List<TestCaseRunInfo> testCaseRunInfos = baseMapper.selectList(queryWrapper);
        return testCaseRunInfos;
    }
}
