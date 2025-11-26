package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户反馈回复表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_feedback_reply")
public class UserFeedbackReplyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 对应用户反馈表ID
	 */
	private Long feedbackId;
	/**
	 * 回复用户ID
	 */
	private Long userId;
	/**
	 * 回复时间
	 */
	private Date replyTime;
	/**
	 * 回复内容
	 */
	private String replyContent;
	/**
	 * 回复管理员用户ID
	 */
	private Long adminUserId;

}
