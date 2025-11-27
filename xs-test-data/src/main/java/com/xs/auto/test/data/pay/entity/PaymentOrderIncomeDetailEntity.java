package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 收益扣减记录表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("payment_order_income_detail")
public class PaymentOrderIncomeDetailEntity implements Serializable {
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
	 * 总收益
	 */
	private BigDecimal earning;
	/**
	 * 扣除金额
	 */
	private BigDecimal deductions;
	/**
	 * 扣除描述
	 */
	private String reasonDeductions;
	/**
	 * 结算收益
	 */
	private BigDecimal settlementEarning;
	/**
	 * 收益日期yyyy-MM-dd
	 */
	private Date incomeTime;
	/**
	 * 收益日期 年
	 */
	private Integer incomeYear;
	/**
	 * 收益日期 月
	 */
	private Integer incomeMonth;
	/**
	 * 收益日期 日
	 */
	private Integer incomeDay;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 买断游戏收益比率-平台
	 */
	private BigDecimal buyPlatform;
	/**
	 * 买断游戏收益比率-开发者
	 */
	private BigDecimal buyDeveloper;
	/**
	 * 买断游戏收益比率-通道费
	 */
	private BigDecimal buyThoroughfare;
	/**
	 * 内购游戏收益比率-平台
	 */
	private BigDecimal appPlatform;
	/**
	 * 内购游戏收益比率-开发者
	 */
	private BigDecimal appDeveloper;
	/**
	 * 内购游戏收益比率-通道费
	 */
	private BigDecimal appThoroughfare;
	/**
	 * 已抵扣预付款
	 */
	private BigDecimal useAdvancePayment;
	/**
	 * 状态0 正常  2已退款
	 */
	private Integer status;
	/**
	 * 热力币金额
	 */
	private BigDecimal calorcoinAmount;
	/**
	 * 热力币金额手继费
	 */
	private BigDecimal calorcoinAmountCommission;

}
