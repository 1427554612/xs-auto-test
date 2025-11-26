package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.PlatformAccountDao;
import com.xs.auto.test.data.pay.entity.PlatformAccountEntity;
import com.xs.auto.test.data.pay.service.PlatformAccountService;


@Service("platformAccountService")
public class PlatformAccountServiceImpl extends ServiceImpl<PlatformAccountDao, PlatformAccountEntity> implements PlatformAccountService {



}