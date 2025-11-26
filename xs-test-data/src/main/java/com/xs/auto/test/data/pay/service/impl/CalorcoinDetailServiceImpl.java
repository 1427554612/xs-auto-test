package com.xs.auto.test.data.pay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xs.auto.test.data.pay.dao.CalorcoinDetailDao;
import com.xs.auto.test.data.pay.entity.CalorcoinDetailEntity;
import com.xs.auto.test.data.pay.service.CalorcoinDetailService;


@Service("calorcoinDetailService")
public class CalorcoinDetailServiceImpl extends ServiceImpl<CalorcoinDetailDao, CalorcoinDetailEntity> implements CalorcoinDetailService {

}