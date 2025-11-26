package com.xs.auto.test.data.admin.dao;

import com.xs.auto.test.data.admin.entity.UserMemberBanEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户封禁/注销账号记录表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Mapper
public interface UserMemberBanDao extends BaseMapper<UserMemberBanEntity> {
	
}
