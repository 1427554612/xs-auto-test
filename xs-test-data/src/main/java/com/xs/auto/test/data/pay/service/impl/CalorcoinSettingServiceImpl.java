package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.CalorcoinSettingDao;
import com.xs.auto.test.data.pay.entity.CalorcoinSettingEntity;
import com.xs.auto.test.data.pay.service.CalorcoinSettingService;


@Service("calorcoinSettingService")
public class CalorcoinSettingServiceImpl extends ServiceImpl<CalorcoinSettingDao, CalorcoinSettingEntity> implements CalorcoinSettingService {



}