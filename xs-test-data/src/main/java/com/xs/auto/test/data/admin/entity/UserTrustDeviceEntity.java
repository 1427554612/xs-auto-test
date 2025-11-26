package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户信任设备表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_trust_device")
public class UserTrustDeviceEntity implements Serializable {
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
	 * 设备唯一标识码
	 */
	private String deviceCode;
	/**
	 * 设备名称
	 */
	private String deviceName;
	/**
	 * 授权时的IP地址
	 */
	private String ipAddress;
	/**
	 * 用户代理信息
	 */
	private String userAgent;
	/**
	 * 是否信任：0-不信任，1-信任
	 */
	private Integer isTrusted;
	/**
	 * 信任过期时间
	 */
	private Date trustExpiresAt;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 最后使用时间
	 */
	private Date lastUsedAt;
	/**
	 * 状态：0-禁用，1-启用，2-删除
	 */
	private Integer status;

}
