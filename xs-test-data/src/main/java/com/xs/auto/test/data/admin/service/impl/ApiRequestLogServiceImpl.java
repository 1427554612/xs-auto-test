package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.ApiRequestLogDao;
import com.xs.auto.test.data.admin.entity.ApiRequestLogEntity;
import com.xs.auto.test.data.admin.service.ApiRequestLogService;


@Service("apiRequestLogService")
public class ApiRequestLogServiceImpl extends ServiceImpl<ApiRequestLogDao, ApiRequestLogEntity> implements ApiRequestLogService {

}