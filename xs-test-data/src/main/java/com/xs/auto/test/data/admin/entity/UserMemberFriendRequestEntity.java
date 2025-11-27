package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 好友请求表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_member_friend_request")
public class UserMemberFriendRequestEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 好友请求id
	 */
	@TableId
	private Long id;
	/**
	 * 发起好友请求的用户id
	 */
	private Long userId;
	/**
	 * 被发起请求的用户id
	 */
	private Long requestUserId;
	/**
	 * 请求时间
	 */
	@TableField(fill = FieldFill.INSERT)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date requestTime;
	/**
	 * 请求说明
	 */
	private String requestInfo;
	/**
	 * 状态：0-待确认；1-已同意，2-已拒绝
	 */
	private Integer status;
	/**
	 * 已读状态: 0-未读，1已读
	 */
	private Integer hadReadStatus;

}
