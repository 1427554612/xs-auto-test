package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;


import com.xs.auto.test.data.admin.dao.UserMemberBanDao;
import com.xs.auto.test.data.admin.entity.UserMemberBanEntity;
import com.xs.auto.test.data.admin.service.UserMemberBanService;


@Service("userMemberBanService")
public class UserMemberBanServiceImpl extends ServiceImpl<UserMemberBanDao, UserMemberBanEntity> implements UserMemberBanService {


}