package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 预付款扣减记录表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("payment_order_advance_log")
public class PaymentOrderAdvanceLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 游戏ID
	 */
	private Long gameId;
	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * 收益来源:广告收益（ad_revenue）内购收益（in_game_purchases）买断收益（full_purchase） 其它收益（other_urchase）
	 */
	private Integer incomeSource;
	/**
	 * 抵扣前总预付款
	 */
	private BigDecimal advancePayment;
	/**
	 * 抵扣前已扣预付款
	 */
	private BigDecimal useAdvancePayment;
	/**
	 * 扣减后已抵扣预付款
	 */
	private BigDecimal advancePaymentThis;
	/**
	 * 本次扣预付款
	 */
	private BigDecimal useAdvancePaymentThis;
	/**
	 * 扣减前结算收益
	 */
	private BigDecimal settlementEarning;
	/**
	 * 扣减后的结算收益
	 */
	private BigDecimal beforeSettlementEarning;
	/**
	 * 创建时间
	 */
	private Date createdAt;

}
