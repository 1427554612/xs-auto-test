package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.AdRegionVendorDao;
import com.xs.auto.test.data.admin.entity.AdRegionVendorEntity;
import com.xs.auto.test.data.admin.service.AdRegionVendorService;


@Service("adRegionVendorService")
public class AdRegionVendorServiceImpl extends ServiceImpl<AdRegionVendorDao, AdRegionVendorEntity> implements AdRegionVendorService {

}