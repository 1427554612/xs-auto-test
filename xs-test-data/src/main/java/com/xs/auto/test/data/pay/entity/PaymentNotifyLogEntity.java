package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 通知日志表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("payment_notify_log")
public class PaymentNotifyLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 批次号
	 */
	private String uuid;
	/**
	 * 类型1:支付成功 2退款
	 */
	private Integer paytype;
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
	 * 通知状态0 正在通知，1通知成功 ，2通知失败
	 */
	private Integer status;
	/**
	 * 通知时间
	 */
	private Date createTime;
	/**
	 * 服务端通知次数
	 */
	private Integer serviceCount;
	/**
	 * 服务端通知状态0 正在通知，1通知成功 ，2通知失败 3、未填回调地址
	 */
	private Integer serviceStatus;
	/**
	 * 服务端通知地址
	 */
	private String serviceUrl;

}
