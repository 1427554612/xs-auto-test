package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.AdPositionSizeDao;
import com.xs.auto.test.data.admin.entity.AdPositionSizeEntity;
import com.xs.auto.test.data.admin.service.AdPositionSizeService;


@Service("adPositionSizeService")
public class AdPositionSizeServiceImpl extends ServiceImpl<AdPositionSizeDao, AdPositionSizeEntity> implements AdPositionSizeService {


}