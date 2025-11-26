package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.CalorcoinInvestDao;
import com.xs.auto.test.data.pay.entity.CalorcoinInvestEntity;
import com.xs.auto.test.data.pay.service.CalorcoinInvestService;


@Service("calorcoinInvestService")
public class CalorcoinInvestServiceImpl extends ServiceImpl<CalorcoinInvestDao, CalorcoinInvestEntity> implements CalorcoinInvestService {


}