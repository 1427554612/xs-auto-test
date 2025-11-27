package com.xs.auto.test.data.admin.dao;

import com.xs.auto.test.data.admin.entity.ApiRequestLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * API请求日志表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Mapper
public interface ApiRequestLogDao extends BaseMapper<ApiRequestLogEntity> {
	
}
