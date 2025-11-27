package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.I18nErrorCodeDao;
import com.xs.auto.test.data.admin.entity.I18nErrorCodeEntity;
import com.xs.auto.test.data.admin.service.I18nErrorCodeService;


@Service("i18nErrorCodeService")
public class I18nErrorCodeServiceImpl extends ServiceImpl<I18nErrorCodeDao, I18nErrorCodeEntity> implements I18nErrorCodeService {


}