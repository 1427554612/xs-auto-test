package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
@TableName("developer_paypal")
public class DeveloperPaypalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键自增
	 */
	@TableId
	private Integer id;
	/**
	 * 开发者ID
	 */
	private Long developerId;
	/**
	 * 付款方式，0：Paypal
	 */
	private Integer paymentMethod;
	/**
	 * PayPal邮箱地址
	 */
	private String paypalEmailAddress;
	/**
	 * 开发者名字
	 */
	private String firstName;
	/**
	 * 增值税号
	 */
	private String vatNumber;
	/**
	 * 开发者名字
	 */
	private String lastName;
	/**
	 * 创建时间

	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;

}
