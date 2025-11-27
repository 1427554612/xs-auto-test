package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.User2faLogDao;
import com.xs.auto.test.data.admin.entity.User2faLogEntity;
import com.xs.auto.test.data.admin.service.User2faLogService;


@Service("user2faLogService")
public class User2faLogServiceImpl extends ServiceImpl<User2faLogDao, User2faLogEntity> implements User2faLogService {


}