package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;
import com.xs.auto.test.data.admin.common.Query;

import com.xs.auto.test.data.admin.dao.AdLinksDao;
import com.xs.auto.test.data.admin.entity.AdLinksEntity;
import com.xs.auto.test.data.admin.service.AdLinksService;


@Service("adLinksService")
public class AdLinksServiceImpl extends ServiceImpl<AdLinksDao, AdLinksEntity> implements AdLinksService {


}