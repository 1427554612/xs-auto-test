package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.CountryLanguageDao;
import com.xs.auto.test.data.admin.entity.CountryLanguageEntity;
import com.xs.auto.test.data.admin.service.CountryLanguageService;


@Service("countryLanguageService")
public class CountryLanguageServiceImpl extends ServiceImpl<CountryLanguageDao, CountryLanguageEntity> implements CountryLanguageService {


}