package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.PaymentXsollwebhookLogDao;
import com.xs.auto.test.data.pay.entity.PaymentXsollwebhookLogEntity;
import com.xs.auto.test.data.pay.service.PaymentXsollwebhookLogService;


@Service("paymentXsollwebhookLogService")
public class PaymentXsollwebhookLogServiceImpl extends ServiceImpl<PaymentXsollwebhookLogDao, PaymentXsollwebhookLogEntity> implements PaymentXsollwebhookLogService {


}