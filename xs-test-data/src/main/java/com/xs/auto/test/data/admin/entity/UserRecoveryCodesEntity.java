package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户2FA恢复代码表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_recovery_codes")
public class UserRecoveryCodesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 恢复代码
	 */
	private String recoveryCode;
	/**
	 * 是否已使用：0-未使用，1-已使用
	 */
	private Integer isUsed;
	/**
	 * 使用时间
	 */
	private Date usedAt;
	/**
	 * 使用时的IP地址
	 */
	private String usedIp;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 过期时间
	 */
	private Date expiresAt;

}
