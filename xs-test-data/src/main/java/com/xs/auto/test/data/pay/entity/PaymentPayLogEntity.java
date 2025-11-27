package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 支付日志表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("payment_pay_log")
public class PaymentPayLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String id;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * sku产品ID
	 */
	private String productId;
	/**
	 * 游戏ID
	 */
	private Long gameId;
	/**
	 * 商品类型1:买断 2商品
	 */
	private Integer purchaseType;
	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * 第三方接口返回的状态
	 */
	private String status;
	/**
	 * 描述
	 */
	private String describeInfo;
	/**
	 * 变更时间
	 */
	private Date createTime;

}
