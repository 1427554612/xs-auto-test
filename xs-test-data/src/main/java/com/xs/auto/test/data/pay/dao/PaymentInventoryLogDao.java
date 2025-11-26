package com.xs.auto.test.data.pay.dao;

import com.xs.auto.test.data.pay.entity.PaymentInventoryLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存日志表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Mapper
public interface PaymentInventoryLogDao extends BaseMapper<PaymentInventoryLogEntity> {
	
}
