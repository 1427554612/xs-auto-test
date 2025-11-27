package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户系统设置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_member_setting")
public class UserMemberSettingEntity implements Serializable {
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
	 * 个人主页的查看权限0开放 1不开放 2仅对好友开放
	 */
	private Integer homePrivilege;
	/**
	 * 给我发游戏邀请0开放 1不开放
	 */
	private Integer gamePrivilege;
	/**
	 * 我的游戏活动权限0开放 1不开放
	 */
	private Integer gameeventsPrivilege;
	/**
	 * 游戏更新消息、推荐游戏消息0开放 1不开放
	 */
	private Integer emailGamenews;
	/**
	 * 平台更新消息0开放 1不开放
	 */
	private Integer emailPlatform;
	/**
	 * 平台功能消息0开放 1不开放
	 */
	private Integer emailPlatformevents;
	/**
	 * 游戏更新消息、推荐游戏消息0开放 1不开放
	 */
	private Integer notifyGamenews;
	/**
	 * 平台更新消息0开放 1不开放
	 */
	private Integer notifyPlatformupdate;
	/**
	 * 平台功能消息0开放 1不开放
	 */
	private Integer notifyPlatform;
	/**
	 * 反馈回复消息0开放 1不开放
	 */
	private Integer notifyPlatformfeedback;
	/**
	 * 系统消息0开放 1不开放
	 */
	private Integer notifySystem;
	/**
	 * 接收好友请求和邀请的消息0开放 1不开放
	 */
	private Integer notifyFriendinvite;
	/**
	 * 请向我发送Jogos游戏更新、活动和新闻0是 1否
	 */
	private Integer emailSetting;
	/**
	 * 是否接收post
	 */
	private Integer notifyPost;

}
