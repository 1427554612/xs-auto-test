package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.H5PageDao;
import com.xs.auto.test.data.admin.entity.H5PageEntity;
import com.xs.auto.test.data.admin.service.H5PageService;


@Service("h5PageService")
public class H5PageServiceImpl extends ServiceImpl<H5PageDao, H5PageEntity> implements H5PageService {


}