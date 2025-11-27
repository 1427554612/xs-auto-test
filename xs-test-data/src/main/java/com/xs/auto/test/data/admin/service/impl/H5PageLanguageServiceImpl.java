package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.H5PageLanguageDao;
import com.xs.auto.test.data.admin.entity.H5PageLanguageEntity;
import com.xs.auto.test.data.admin.service.H5PageLanguageService;


@Service("h5PageLanguageService")
public class H5PageLanguageServiceImpl extends ServiceImpl<H5PageLanguageDao, H5PageLanguageEntity> implements H5PageLanguageService {


}