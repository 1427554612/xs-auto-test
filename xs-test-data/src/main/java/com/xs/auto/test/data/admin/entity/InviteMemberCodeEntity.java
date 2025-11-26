package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 邀请码表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("invite_member_code")
public class InviteMemberCodeEntity implements Serializable {
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
	 * 游客ID
	 */
	private Long touristId;
	/**
	 * 玩家昵称
	 */
	private String userName;
	/**
	 * 游戏内角色ID
	 */
	private String userroleid;
	/**
	 * 角色所在区服ID
	 */
	private String serverid;
	/**
	 * 分享类型（game/achievement/activity等）
	 */
	private String shareType;
	/**
	 * 游戏ID
	 */
	private Long gameId;
	/**
	 * 游戏名称
	 */
	private String gamename;
	/**
	 * 分享图片（如游戏logo/截图等）
	 */
	private String shareImage;
	/**
	 * 动态分享内容配置对象（可选，用于动态生成分享内容，如游戏活动/进度/成就/得分/房间号/关卡数/组队等，可以支持受邀玩家进入的场景）
	 */
	private String dynamiccontent;
	/**
	 * 目标社交平
	 */
	private String targetPlatform;
	/**
	 * 邀请码
	 */
	private String invitecode;
	/**
	 * 状态0生成 1成功
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createAt;
	/**
	 * 设备
	 */
	private String clientsystem;

}
