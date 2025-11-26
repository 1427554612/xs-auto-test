package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户授权信任设备表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("tb_admin_trust_device")
public class TbAdminTrustDeviceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId
	private Integer id;
	/**
	 * 用户id
	 */
	private Long adminId;
	/**
	 * 设备唯一码
	 */
	private String deviceCode;
	/**
	 * 设备授权时间
	 */
	private Long createTime;
	/**
	 * 状态 0启用 1禁用 2删除
	 */
	private Integer status;
	/**
	 * 设备名称
	 */
	private String deviceName;
	/**
	 * 授权时的ip地址
	 */
	private String ip;
	/**
	 * 该设备最后登录时间
	 */
	private Long lastLoginTime;

}
