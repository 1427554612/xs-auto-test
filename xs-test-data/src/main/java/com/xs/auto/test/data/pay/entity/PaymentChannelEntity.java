package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 支付渠道表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("payment_channel")
public class PaymentChannelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 支付方式
	 */
	private String paymentChannel;
	/**
	 * 权重
	 */
	private Integer weight;
	/**
	 * 单笔最大金额null表示不限
	 */
	private BigDecimal maxAmount;
	/**
	 * 单笔最小金额null表示不限
	 */
	private BigDecimal minAmount;
	/**
	 * 状态0 停用 1正常 
	 */
	private Integer status;
	/**
	 * 图片
	 */
	private String imageUrl;
	/**
	 * 角标图片
	 */
	private String iconUrl;
	/**
	 * 角标状态0 停用 1正常
	 */
	private Integer iconStatus;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 更新人
	 */
	private String updateBy;

}
