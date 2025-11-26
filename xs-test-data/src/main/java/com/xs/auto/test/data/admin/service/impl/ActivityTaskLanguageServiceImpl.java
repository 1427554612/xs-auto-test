package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.ActivityTaskLanguageDao;
import com.xs.auto.test.data.admin.entity.ActivityTaskLanguageEntity;
import com.xs.auto.test.data.admin.service.ActivityTaskLanguageService;


@Service("activityTaskLanguageService")
public class ActivityTaskLanguageServiceImpl extends ServiceImpl<ActivityTaskLanguageDao, ActivityTaskLanguageEntity> implements ActivityTaskLanguageService {


}