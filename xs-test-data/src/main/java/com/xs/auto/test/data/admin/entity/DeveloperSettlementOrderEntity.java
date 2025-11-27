package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("developer_settlement_order")
public class DeveloperSettlementOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 订单编号
	 */
	@TableId
	private String orderId;
	/**
	 * 开发者ID
	 */
	private Integer developerId;
	/**
	 * 收款账号
	 */
	private String account;
	/**
	 * 申请时间
	 */
	private Date applyTime;
	/**
	 * 支付渠道
	 */
	private Integer paymentChannels;
	/**
	 * 结算方式,0:paypal
	 */
	private Integer paymentMethodId;
	/**
	 * 结算金额
	 */
	private String settlementAmount;
	/**
	 * 签名，还未经过开发者主动或自动确认时，签名栏为空。
	 */
	private String signature;
	/**
	 * 扣减原因
	 */
	private String deductionReason;
	/**
	 * 拒绝原因
	 */
	private String rejectionReason;
	/**
	 * 结算状态0：待审核，1:待结算，2:待确认，3:结算中，4：已取消，5:已结算，6：驳回
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 结算周期
	 */
	private String settlementCycle;
	/**
	 * 结算订单
	 */
	private String transactionId;
	/**
	 * 主体用户
	 */
	private String issUser;
	/**
	 * 发行时间
	 */
	private String issuanceDate;
	/**
	 * 主体邮箱
	 */
	private String email;
	/**
	 * 主体电话
	 */
	private String phone;
	/**
	 * 开发者名称
	 */
	private String developerName;
	/**
	 * 开发者邮箱
	 */
	private String developerEmail;
	/**
	 * 开发者手机号
	 */
	private String developerPhone;
	/**
	 * 开发者付款详情
	 */
	private String paymentDetails;
	/**
	 * 通道费率
	 */
	private BigDecimal channelRate;

}
