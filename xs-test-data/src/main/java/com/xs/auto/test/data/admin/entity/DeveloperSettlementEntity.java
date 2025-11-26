package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 结算明细表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("developer_settlement")
public class DeveloperSettlementEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 结算编号
	 */
	@TableId
	private String settlementId;
	/**
	 * 订单编号
	 */
	private String orderId;
	/**
	 * 结算周期
	 */
	private Date settlementPeriod;
	/**
	 * 收入类型
	 */
	private Integer earningType;
	/**
	 * 金额
	 */
	private BigDecimal amount;
	/**
	 * 净额
	 */
	private BigDecimal netAmount;
	/**
	 * 扣减额
	 */
	private BigDecimal deductions;
	/**
	 * 结算金额
	 */
	private BigDecimal settlementAmount;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 开发者编号
	 */
	private Long developerId;
	/**
	 * 预付款扣减额
	 */
	private BigDecimal advancePaymentDeductions;

}
