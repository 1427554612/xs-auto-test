package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.ActivityTaskDao;
import com.xs.auto.test.data.admin.entity.ActivityTaskEntity;
import com.xs.auto.test.data.admin.service.ActivityTaskService;


@Service("activityTaskService")
public class ActivityTaskServiceImpl extends ServiceImpl<ActivityTaskDao, ActivityTaskEntity> implements ActivityTaskService {


}