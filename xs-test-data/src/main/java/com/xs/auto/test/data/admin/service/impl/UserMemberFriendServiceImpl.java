package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.common.PageUtils;
import com.xs.auto.test.data.admin.common.Query;

import com.xs.auto.test.data.admin.dao.UserMemberFriendDao;
import com.xs.auto.test.data.admin.entity.UserMemberFriendEntity;
import com.xs.auto.test.data.admin.service.UserMemberFriendService;


@Service("userMemberFriendService")
public class UserMemberFriendServiceImpl extends ServiceImpl<UserMemberFriendDao, UserMemberFriendEntity> implements UserMemberFriendService {

}