package com.xs.auto.test.data.admin.dao;

import com.xs.auto.test.data.admin.entity.CountryLanguageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 国家语言关系表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Mapper
public interface CountryLanguageDao extends BaseMapper<CountryLanguageEntity> {
	
}
