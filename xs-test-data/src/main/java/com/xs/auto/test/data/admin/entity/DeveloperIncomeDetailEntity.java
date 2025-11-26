package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 收益明细表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("developer_income_detail")
public class DeveloperIncomeDetailEntity implements Serializable {
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
	 * 结算状态待结算0、 结算中1、已结算2
	 */
	private Integer status;
	/**
	 * 结算编号
	 */
	private String batchId;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * 游戏ID
	 */
	private Long gameId;
	/**
	 * 预付款扣减额
	 */
	private BigDecimal advancePaymentDeductions;
	/**
	 * 退款状态,0：未退款，1：退款成功
	 */
	private Integer refundStatus;
	/**
	 * 热力币金额手继费
	 */
	private BigDecimal calorcoinAmountCommission;
	/**
	 * 热力币金额
	 */
	private BigDecimal calorcoinAmount;

}
