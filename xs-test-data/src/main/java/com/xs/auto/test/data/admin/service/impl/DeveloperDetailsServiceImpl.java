package com.xs.auto.test.data.admin.service.impl;

import com.xs.auto.test.data.admin.common.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;

import com.xs.auto.test.data.admin.dao.DeveloperDetailsDao;
import com.xs.auto.test.data.admin.entity.DeveloperDetailsEntity;
import com.xs.auto.test.data.admin.service.DeveloperDetailsService;


@Service("developerDetailsService")
public class DeveloperDetailsServiceImpl extends ServiceImpl<DeveloperDetailsDao, DeveloperDetailsEntity> implements DeveloperDetailsService {


}