package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("payment_order")
public class PaymentOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 支付方式
	 */
	private Integer paymentChannel;
	/**
	 * 第三方支付订单号
	 */
	private String paymentOrderId;
	/**
	 * 第三方支付token
	 */
	private String paymentOrderToken;
	/**
	 * 第三方支付交易ID
	 */
	private String transactionId;
	/**
	 * 游戏ID
	 */
	private Long gameId;
	/**
	 * 国家
	 */
	private String country;
	/**
	 * 1	买断付费收益 2内购付费收益 3-道具  9广告收益
	 */
	private Integer paymentType;
	/**
	 * sku商品唯一ID
	 */
	private String productId;
	/**
	 * 产品名称
	 */
	private String productName;
	/**
	 * 是否沙盒测试0 否 1 是
	 */
	private Integer sandbox;
	/**
	 * 订单合计金额
	 */
	private BigDecimal paymentAmount;
	/**
	 * 订单合计购买数量
	 */
	private String paymentCount;
	/**
	 * xsolla实际出款金额
	 */
	private BigDecimal xsollaPaymentAmount;
	/**
	 * 实际支付金额
	 */
	private BigDecimal payAmount;
	/**
	 * 扣除金额
	 */
	private BigDecimal deductions;
	/**
	 * 优惠金额
	 */
	private BigDecimal discount;
	/**
	 * 热力币金额
	 */
	private BigDecimal calorcoinAmount;
	/**
	 * 币种
	 */
	private String currency;
	/**
	 * 订单状态 0：未完成 1：支付失败 2：取消 3：过期 9：成功，（5：退款中，6退款成功，这两个字段又sql形成的字段，靠refundStatus控制）
	 */
	private Integer orderStatus;
	/**
	 * 支付状态 0：未完成 1：支付失败 2：取消 超时失败 3：异常 9：成功
	 */
	private Integer payStatus;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 成功支付时间
	 */
	private Date payTime;
	/**
	 * 商品价格设置表ID
	 */
	private Long purchaseid;
	/**
	 * 商品库存ID
	 */
	private String stockNo;
	/**
	 * 退款状态,-1：没退款 0：退款中，1：退款成功  2退款失败 3拒绝退款
	 */
	private Integer refundStatus;
	/**
	 * 退款单号 xsolla为空
	 */
	private String refundNo;
	/**
	 * 退款原因
	 */
	private String refundDescription;
	/**
	 * 退款时间
	 */
	private Date refundCreateTime;
	/**
	 * 退款完成时间
	 */
	private Date refundSuccTime;
	/**
	 * 开发者用户ID
	 */
	private Long devUserId;
	/**
	 * 订单sku
	 */
	private String sku;
	/**
	 * 退款接口说明
	 */
	private String refundMsg;
	/**
	 * 热力币金额手继费
	 */
	private BigDecimal calorcoinAmountCommission;
	/**
	 * 到货状态 0：未到货 1：到货成功
	 */
	private Integer arrivedStatus;
	/**
	 * 用户实际支付币种
	 */
	private String userCurrency;
	/**
	 * 用户实际支付价格
	 */
	private BigDecimal userAmount;
	/**
	 * xsolla实际支付价格
	 */
	private BigDecimal purchaseAmount;

}
