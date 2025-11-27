package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户2FA操作日志表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_2fa_log")
public class User2faLogEntity implements Serializable {
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
	 * 操作类型(LOGIN_VERIFY/ENABLE_2FA/DISABLE_2FA/RESET_SECRET/USE_RECOVERY_CODE)
	 */
	private String operationType;
	/**
	 * 验证方式(GOOGLE_TOTP/RECOVERY_CODE/EMAIL/SMS)
	 */
	private String verifyMethod;
	/**
	 * 操作结果：0-失败，1-成功
	 */
	private Integer result;
	/**
	 * IP地址
	 */
	private String ipAddress;
	/**
	 * 用户代理
	 */
	private String userAgent;
	/**
	 * 设备标识码
	 */
	private String deviceCode;
	/**
	 * 失败原因
	 */
	private String failureReason;
	/**
	 * 创建时间
	 */
	private Date createdAt;

}
