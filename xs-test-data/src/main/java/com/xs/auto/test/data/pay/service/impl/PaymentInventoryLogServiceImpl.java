package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.PaymentInventoryLogDao;
import com.xs.auto.test.data.pay.entity.PaymentInventoryLogEntity;
import com.xs.auto.test.data.pay.service.PaymentInventoryLogService;


@Service("paymentInventoryLogService")
public class PaymentInventoryLogServiceImpl extends ServiceImpl<PaymentInventoryLogDao, PaymentInventoryLogEntity> implements PaymentInventoryLogService {

}