package com.xs.auto.test.data.pay.entity;

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
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("platform_account")
public class PlatformAccountEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 热力币可用余额
	 */
	private BigDecimal calorcoinAmount;
	/**
	 * 支付密码
	 */
	private String password;
	/**
	 * 抵扣金
	 */
	private BigDecimal calorcoinDeductionAmount;
	/**
	 * 版本号
	 */
	private Integer version;
	/**
	 * 冻结热力币
	 */
	private BigDecimal freezeCalorcoinAmount;
	/**
	 * 冻结抵扣金
	 */
	private BigDecimal freezeCalorcoinDeductionAmount;

}
