package com.xs.auto.test.data.admin.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.data.admin.dao.UserMemberWalletDao;
import com.xs.auto.test.data.admin.entity.UserMemberWalletEntity;
import com.xs.auto.test.data.admin.service.UserMemberWalletService;


@Service("userMemberWalletService")
public class UserMemberWalletServiceImpl extends ServiceImpl<UserMemberWalletDao, UserMemberWalletEntity> implements UserMemberWalletService {


}