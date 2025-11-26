package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.PaymentPayLogDao;
import com.xs.auto.test.data.pay.entity.PaymentPayLogEntity;
import com.xs.auto.test.data.pay.service.PaymentPayLogService;


@Service("paymentPayLogService")
public class PaymentPayLogServiceImpl extends ServiceImpl<PaymentPayLogDao, PaymentPayLogEntity> implements PaymentPayLogService {



}