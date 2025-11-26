package com.xs.auto.test.data.admin.dao;

import com.xs.auto.test.data.admin.entity.ActivityUserPrizeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 活动用户奖品表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Mapper
public interface ActivityUserPrizeDao extends BaseMapper<ActivityUserPrizeEntity> {

    /**
     * 插入数据
     * @return
     */
    int saveActivityUserPrize(Integer userId,String account);
	
}
