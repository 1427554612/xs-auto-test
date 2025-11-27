package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户登录日志表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_login_log")
public class UserLoginLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 日志ID
	 */
	@TableId
	private Long logId;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 用户IP地址
	 */
	private String ipAddress;
	/**
	 * 设备信息
	 */
	private String device;
	/**
	 * 是否为异地登录：0否，1是
	 */
	private Integer isAbnormal;
	/**
	 * 登录时间
	 */
	private Date loginTime;
	/**
	 * 登出时间
	 */
	private Date logoutTime;
	/**
	 * 浏览器登录语言
	 */
	private String browserLanguage;
	/**
	 * 地区/城市
	 */
	private String location;
	/**
	 * 客户端
	 */
	private String clientsystem;

}
