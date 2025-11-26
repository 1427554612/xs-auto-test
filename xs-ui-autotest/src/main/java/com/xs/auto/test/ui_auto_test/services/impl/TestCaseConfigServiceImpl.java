package com.xs.auto.test.ui_auto_test.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.ui_auto_test.entity.TestCaseConfig;
import com.xs.auto.test.ui_auto_test.mapper.TestCaseConfigMapper;
import com.xs.auto.test.ui_auto_test.services.TestCaseConfigService;
import org.springframework.stereotype.Service;

@Service
public class TestCaseConfigServiceImpl
        extends ServiceImpl<TestCaseConfigMapper, TestCaseConfig>
        implements TestCaseConfigService {

}
