package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户登录日志表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("sys_admin_login_log")
public class SysAdminLoginLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 用户id
	 */
	private Long adminId;
	/**
	 * 操作时间
	 */
	private Date operateTime;
	/**
	 * 操作类型：1登录，2登出
	 */
	private Integer type;
	/**
	 * 登录IP
	 */
	private String ip;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 登陆地址
	 */
	private String address;
	/**
	 * 浏览器登录类型
	 */
	private String userAgent;
	/**
	 * 登录方式: 0:手机号(用户)  1:邮箱(用户)  2:用户名
	 */
	private Integer loginType;
	/**
	 * 信任设备唯一code
	 */
	private String trustDeviceId;
	/**
	 * 设备名称
	 */
	private String deviceName;

}
