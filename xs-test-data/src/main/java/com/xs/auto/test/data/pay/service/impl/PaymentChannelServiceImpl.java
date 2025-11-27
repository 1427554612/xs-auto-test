package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.PaymentChannelDao;
import com.xs.auto.test.data.pay.entity.PaymentChannelEntity;
import com.xs.auto.test.data.pay.service.PaymentChannelService;


@Service("paymentChannelService")
public class PaymentChannelServiceImpl extends ServiceImpl<PaymentChannelDao, PaymentChannelEntity> implements PaymentChannelService {



}