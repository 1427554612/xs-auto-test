package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * xsolla支付回调日志表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("payment_xsollwebhook_log")
public class PaymentXsollwebhookLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String id;
	/**
	 * 描述
	 */
	private String body;
	/**
	 * 返回状态
	 */
	private Integer responseCode;
	/**
	 * 返回内容
	 */
	private String responseMsg;
	/**
	 * 变更时间
	 */
	private Date createTime;

}
