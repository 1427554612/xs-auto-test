package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 游客用户表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("tourist_user_member")
public class TouristUserMemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@TableId
	private Long touristId;
	/**
	 * 游客唯一key
	 */
	private String userCode;
	/**
	 * 注册时间
	 */
	private Date registrationTime;
	/**
	 * 最近登录时间
	 */
	private Date loginTime;
	/**
	 * 设备信息
	 */
	private String device;
	/**
	 * 注册状态（0待注册, 1已注册）
	 */
	private Integer regStatus;
	/**
	 * 状态（0正常, 1禁用）
	 */
	private Integer status;
	/**
	 * 客户端
	 */
	private String clientsystem;
	/**
	 * 每一次注册绑定的用户ID
	 */
	private Long userId;
	/**
	 * 当前绑定的用户ID
	 */
	private Long currentUserId;

}
