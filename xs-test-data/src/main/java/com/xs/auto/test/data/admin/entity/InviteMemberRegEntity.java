package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 邀请码注册表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("invite_member_reg")
public class InviteMemberRegEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 邀请码
	 */
	private String invitecode;
	/**
	 * 注册用户ID
	 */
	private Long userId;
	/**
	 * 注册时间
	 */
	private Date createAt;
	/**
	 * 目标社交平
	 */
	private String targetPlatform;
	/**
	 * 设备
	 */
	private String clientsystem;

}
