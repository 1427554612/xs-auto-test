package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户post表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_member_post")
public class UserMemberPostEntity implements Serializable {
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
	 * 内容
	 */
	private String postContent;
	/**
	 * 状态（0待审核 1审核通过 2审核不通过)
	 */
	private Integer status;
	/**
	 * 审核人员
	 */
	private Long auditedUserId;
	/**
	 * 审核结果内容
	 */
	private String auditedRemark;
	/**
	 * 审核时间
	 */
	private Date auditedTime;
	/**
	 * 增加时间
	 */
	private Date createdAt;

}
