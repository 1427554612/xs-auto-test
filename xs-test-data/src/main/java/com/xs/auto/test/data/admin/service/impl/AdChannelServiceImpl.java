package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;
import com.xs.auto.test.data.admin.common.Query;

import com.xs.auto.test.data.admin.dao.AdChannelDao;
import com.xs.auto.test.data.admin.entity.AdChannelEntity;
import com.xs.auto.test.data.admin.service.AdChannelService;


@Service("adChannelService")
public class AdChannelServiceImpl extends ServiceImpl<AdChannelDao, AdChannelEntity> implements AdChannelService {

}