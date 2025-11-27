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
@TableName("payment_method")
public class PaymentMethodEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增主键
	 */
	@TableId
	private Integer id;
	/**
	 * 支付方式
	 */
	private String paymentMethod;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 服务费比率
	 */
	private BigDecimal serviceFeeRatio;
	/**
	 * 固定金额
	 */
	private BigDecimal fixed;

}
