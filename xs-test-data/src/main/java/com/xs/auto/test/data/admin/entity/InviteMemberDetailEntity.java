package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 邀请码访问表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("invite_member_detail")
public class InviteMemberDetailEntity implements Serializable {
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
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 游客ID
	 */
	private Long touristId;
	/**
	 * 访问时间
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
