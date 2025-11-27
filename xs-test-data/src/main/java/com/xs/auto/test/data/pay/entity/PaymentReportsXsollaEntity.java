package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * xsolla对账表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("payment_reports_xsolla")
public class PaymentReportsXsollaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 对账日期start
	 */
	private String starttime;
	/**
	 * 对账日期end
	 */
	private String endtime;
	/**
	 * 对账年月
	 */
	private String reportmonth;
	/**
	 * 记录时间
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Integer projectid;
	/**
	 * 
	 */
	private String projectname;
	/**
	 * 
	 */
	private String paymentMethod;
	/**
	 * 
	 */
	private String transferDate;
	/**
	 * 
	 */
	private Long transferid;
	/**
	 * 
	 */
	private String refundReason;
	/**
	 * 
	 */
	private String transferStatus;
	/**
	 * 
	 */
	private String orderNo;
	/**
	 * 
	 */
	private String transferCreateDate;
	/**
	 * 
	 */
	private Integer dryRun;
	/**
	 * 
	 */
	private Integer isRefundAllowed;
	/**
	 * 
	 */
	private Long userId;
	/**
	 * 
	 */
	private String userName;
	/**
	 * 
	 */
	private String userCustom;
	/**
	 * 
	 */
	private String userEmail;
	/**
	 * 
	 */
	private String userPhone;
	/**
	 * 
	 */
	private String userCountry;
	/**
	 * 
	 */
	private String paymentCurrency;
	/**
	 * 
	 */
	private BigDecimal paymentAmount;
	/**
	 * 
	 */
	private BigDecimal paymentAmountFromPs;
	/**
	 * 
	 */
	private BigDecimal salesTaxPercent;
	/**
	 * 
	 */
	private BigDecimal salesTaxAmount;
	/**
	 * 
	 */
	private BigDecimal virtualCurrencyAmount;
	/**
	 * 
	 */
	private String virtualCurrencyName;
	/**
	 * 
	 */
	private String virtualItems;
	/**
	 * 
	 */
	private BigDecimal simpleCheckoutAmount;
	/**
	 * 
	 */
	private String simpleCheckoutCurrency;
	/**
	 * 
	 */
	private BigDecimal pinCodesAmount;
	/**
	 * 
	 */
	private String pinCodesCurrency;
	/**
	 * 
	 */
	private String pinCodesContent;
	/**
	 * 
	 */
	private String purchaseSubscription;
	/**
	 * 
	 */
	private Integer purchaseOrderId;
	/**
	 * 
	 */
	private String purchaseStoreCart;
	/**
	 * 
	 */
	private String declineReason;

}
