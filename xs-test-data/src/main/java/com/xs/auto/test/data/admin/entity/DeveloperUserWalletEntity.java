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
@TableName("developer_user_wallet")
public class DeveloperUserWalletEntity implements Serializable {
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

}
