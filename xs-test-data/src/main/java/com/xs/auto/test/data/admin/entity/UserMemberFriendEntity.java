package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 好友关系表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-17 16:59:47
 */
@Data
@TableName("user_member_friend")
public class UserMemberFriendEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 好友关系id
	 */
	@TableId(type= IdType.AUTO)
	private Long id;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 好友id
	 */
	private Long friendId;
	/**
	 * 好友分组id
	 */
	private Long friendGroupId;
	/**
	 * 免打扰状态：0正常，1免打扰
	 */
	private Integer blockStatus;
	/**
	 * 好友关系状态：0已建立，1已拉黑,1已删除
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	/**
	 * 最后一次消息发送时间
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lastSendTime;

}
