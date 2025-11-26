package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.CalorcoinTypeDao;
import com.xs.auto.test.data.pay.entity.CalorcoinTypeEntity;
import com.xs.auto.test.data.pay.service.CalorcoinTypeService;


@Service("calorcoinTypeService")
public class CalorcoinTypeServiceImpl extends ServiceImpl<CalorcoinTypeDao, CalorcoinTypeEntity> implements CalorcoinTypeService {



}