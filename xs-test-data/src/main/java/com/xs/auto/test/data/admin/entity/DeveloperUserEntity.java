package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 开发者表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-17 16:59:47
 */
@Data
@TableName("developer_user")
public class DeveloperUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 开发者ID
	 */
	@TableId
	private Long developerId;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 游戏开发者显示名称
	 */
	private String displayname;
	/**
	 * 游戏开发者联系邮箱地址
	 */
	private String contactemail;
	/**
	 * 游戏开发者联系姓名
	 */
	private String contactname;
	/**
	 * 游戏开发者appId
	 */
	private String appid;
	/**
	 * 游戏开发者secret
	 */
	private String secret;
	/**
	 * 激活时间
	 */
	private Date activationTime;
	/**
	 * 开发者推送消息数量
	 */
	private Integer msgLimit;
	/**
	 * 我想收到玩家反馈的电子邮件
	 */
	private Integer receiveFeedback;
	/**
	 * 备注名
	 */
	private String reName;
	/**
	 * 
	 */
	private String picFileList;

}
