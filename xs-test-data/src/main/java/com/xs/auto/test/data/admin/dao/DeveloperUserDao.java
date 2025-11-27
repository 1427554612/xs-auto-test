package com.xs.auto.test.data.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xs.auto.test.data.admin.entity.DeveloperUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 开发者表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-17 16:59:47
 */
@Mapper
public interface DeveloperUserDao extends BaseMapper<DeveloperUserEntity> {
	
}
