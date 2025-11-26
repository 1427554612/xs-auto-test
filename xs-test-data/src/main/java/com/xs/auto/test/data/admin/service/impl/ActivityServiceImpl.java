package com.xs.auto.test.data.admin.service.impl;

import com.xs.auto.test.data.admin.common.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;;

import com.xs.auto.test.data.admin.dao.ActivityDao;
import com.xs.auto.test.data.admin.entity.ActivityEntity;
import com.xs.auto.test.data.admin.service.ActivityService;


@Service("activityService")
public class ActivityServiceImpl extends ServiceImpl<ActivityDao, ActivityEntity> implements ActivityService {


}