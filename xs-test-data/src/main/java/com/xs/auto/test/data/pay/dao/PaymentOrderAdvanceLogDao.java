package com.xs.auto.test.data.pay.dao;

import com.xs.auto.test.data.pay.entity.PaymentOrderAdvanceLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 预付款扣减记录表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Mapper
public interface PaymentOrderAdvanceLogDao extends BaseMapper<PaymentOrderAdvanceLogEntity> {
	
}
