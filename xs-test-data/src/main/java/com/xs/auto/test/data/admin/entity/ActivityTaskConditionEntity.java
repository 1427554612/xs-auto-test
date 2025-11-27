package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务条件表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_task_condition")
public class ActivityTaskConditionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 任务ID
	 */
	private Long taskId;
	/**
	 * 条件类型：1-游戏时长，2-转发次数，3-体验游戏，4-购买商品，5-浏览页面，6-邀请好友，7-点赞游戏，8-添加好友，9-使用热力币，10-支付热力币
	 */
	private Integer conditionType;
	/**
	 * 条件数值
	 */
	private BigDecimal conditionValue;
	/**
	 * 条件单位：秒、次、元等
	 */
	private String conditionUnit;
	/**
	 * 跳转链接
	 */
	private String targetUrl;
	/**
	 * 是否主要条件：1-是，0-否（额外条件）
	 */
	private Integer isMainCondition;
	/**
	 * 购买类型：1-指定金额，2-指定次数（购买商品条件专用）
	 */
	private Integer purchaseType;
	/**
	 * 邀请用户类型：1-新用户，2-老用户，3-全部（邀请好友条件专用）
	 */
	private Integer inviteUserType;
	/**
	 * 是否仅统计跳转链接：0-否，1-是
	 */
	private Integer onlyTargetLink;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 操作人
	 */
	private Long operatorId;

}
