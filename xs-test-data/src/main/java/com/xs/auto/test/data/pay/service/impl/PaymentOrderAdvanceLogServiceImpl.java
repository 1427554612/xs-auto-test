package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.PaymentOrderAdvanceLogDao;
import com.xs.auto.test.data.pay.entity.PaymentOrderAdvanceLogEntity;
import com.xs.auto.test.data.pay.service.PaymentOrderAdvanceLogService;


@Service("paymentOrderAdvanceLogService")
public class PaymentOrderAdvanceLogServiceImpl extends ServiceImpl<PaymentOrderAdvanceLogDao, PaymentOrderAdvanceLogEntity> implements PaymentOrderAdvanceLogService {


}