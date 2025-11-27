package com.xs.auto.test.data.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xs.auto.test.data.admin.entity.AdChannelEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 自定义渠道管理表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-17 16:59:47
 */
@Mapper
public interface AdChannelDao extends BaseMapper<AdChannelEntity> {
	
}
