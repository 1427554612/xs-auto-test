package com.xs.auto.test.data.admin.dao;

import com.xs.auto.test.data.admin.entity.TouristUserMemberBanEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 游客用户封禁记录表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Mapper
public interface TouristUserMemberBanDao extends BaseMapper<TouristUserMemberBanEntity> {
	
}
