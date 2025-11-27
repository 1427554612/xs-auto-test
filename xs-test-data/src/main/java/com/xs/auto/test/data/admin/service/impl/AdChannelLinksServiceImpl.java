package com.xs.auto.test.data.admin.service.impl;


import com.xs.auto.test.data.admin.common.PageUtils;
import com.xs.auto.test.data.admin.common.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xs.auto.test.data.admin.dao.AdChannelLinksDao;
import com.xs.auto.test.data.admin.entity.AdChannelLinksEntity;
import com.xs.auto.test.data.admin.service.AdChannelLinksService;


@Service("adChannelLinksService")
public class AdChannelLinksServiceImpl extends ServiceImpl<AdChannelLinksDao, AdChannelLinksEntity> implements AdChannelLinksService {


}