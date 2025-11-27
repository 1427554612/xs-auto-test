package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.XsollaCurrencysDao;
import com.xs.auto.test.data.pay.entity.XsollaCurrencysEntity;
import com.xs.auto.test.data.pay.service.XsollaCurrencysService;


@Service("xsollaCurrencysService")
public class XsollaCurrencysServiceImpl extends ServiceImpl<XsollaCurrencysDao, XsollaCurrencysEntity> implements XsollaCurrencysService {


}