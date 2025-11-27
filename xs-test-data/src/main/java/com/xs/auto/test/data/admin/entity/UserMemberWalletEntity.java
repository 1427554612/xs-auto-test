package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户钱包
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_member_wallet")
public class UserMemberWalletEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 当前余额
	 */
	private BigDecimal amount;
	/**
	 * 当前冻结余额
	 */
	private BigDecimal freezeAmount;
	/**
	 * Unfreeze 当前解冻余额
	 */
	private BigDecimal unfreezeAmount;
	/**
	 * 热力币当前余额
	 */
	private BigDecimal calorcoinAmount;
	/**
	 * 当前冻结余额
	 */
	private BigDecimal calorcoinFreezeAmount;
	/**
	 * Unfreeze 当前解冻余额
	 */
	private BigDecimal calorcoinUnfreezeAmount;
	/**
	 * 当前抵扣金余额
	 */
	private BigDecimal calorcoinDeductionAmount;
	/**
	 * 当前抵扣金冻结余额
	 */
	private BigDecimal calorcoinDeductionFreezeAmount;
	/**
	 * Unfreeze 当前抵扣金解冻余额
	 */
	private BigDecimal calorcoinDeductionUnfreezeAmount;
	/**
	 * 乐观锁版本号
	 */
	private Integer version;

}
