package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.PaymentInventoryDao;
import com.xs.auto.test.data.pay.entity.PaymentInventoryEntity;
import com.xs.auto.test.data.pay.service.PaymentInventoryService;


@Service("paymentInventoryService")
public class PaymentInventoryServiceImpl extends ServiceImpl<PaymentInventoryDao, PaymentInventoryEntity> implements PaymentInventoryService {


}