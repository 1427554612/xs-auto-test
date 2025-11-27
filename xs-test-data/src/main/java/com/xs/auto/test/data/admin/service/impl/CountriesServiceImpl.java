package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.CountriesDao;
import com.xs.auto.test.data.admin.entity.CountriesEntity;
import com.xs.auto.test.data.admin.service.CountriesService;


@Service("countriesService")
public class CountriesServiceImpl extends ServiceImpl<CountriesDao, CountriesEntity> implements CountriesService {


}