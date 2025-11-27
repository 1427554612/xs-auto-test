package com.xs.auto.test.data.pay.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xs.auto.test.data.pay.entity.CalorcoinDetailEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 热力币记录
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Mapper
@Repository
public interface CalorcoinDetailDao extends BaseMapper<CalorcoinDetailEntity> {

    void saveCoin(String account, Integer payType);
}
