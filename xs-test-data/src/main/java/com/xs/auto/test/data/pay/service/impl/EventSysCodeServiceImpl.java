package com.xs.auto.test.data.pay.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.xs.auto.test.data.pay.dao.EventSysCodeDao;
import com.xs.auto.test.data.pay.entity.EventSysCodeEntity;
import com.xs.auto.test.data.pay.service.EventSysCodeService;


@Service("eventSysCodeService")
public class EventSysCodeServiceImpl extends ServiceImpl<EventSysCodeDao, EventSysCodeEntity> implements EventSysCodeService {



}