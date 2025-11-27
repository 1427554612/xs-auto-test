package com.xs.auto.test.data.pay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.PaymentOrderDao;
import com.xs.auto.test.data.pay.entity.PaymentOrderEntity;
import com.xs.auto.test.data.pay.service.PaymentOrderService;


@Service("paymentOrderService")
public class PaymentOrderServiceImpl extends ServiceImpl<PaymentOrderDao, PaymentOrderEntity> implements PaymentOrderService {

}