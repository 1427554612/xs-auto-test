package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 活动主表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity")
public class ActivityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 活动ID
	 */
	@TableId
	private Long id;
	/**
	 * 活动编号
	 */
	private String activityCode;
	/**
	 * 活动名称
	 */
	private String activityName;
	/**
	 * 活动封面
	 */
	private String activityCover;
	/**
	 * 按钮名称
	 */
	private String buttonName;
	/**
	 * 活动类型：1-抽奖，2-任务
	 */
	private Integer activityType;
	/**
	 * 抽奖形式：1-转盘，2-挂卡，3-宝箱
	 */
	private Integer lotteryForm;
	/**
	 * 任务形式：1-指定次数，2-阶梯上升
	 */
	private Integer taskForm;
	/**
	 * 活动开始时间
	 */
	private Date startTime;
	/**
	 * 活动结束时间
	 */
	private Date endTime;
	/**
	 * 实际结束时间（人工结束时记录）
	 */
	private Date actualEndTime;
	/**
	 * 活动周期：1-每月，2-每周，3-每日，4-单次
	 */
	private Integer cycleType;
	/**
	 * 循环次数
	 */
	private Integer cycleCount;
	/**
	 * 每日上限
	 */
	private Integer dailyLimit;
	/**
	 * 活动人群：1-所有人，2-新用户，3-老用户
	 */
	private String targetAudience;
	/**
	 * 排序值
	 */
	private Integer sortValue;
	/**
	 * 状态:0-待激活，1已激活-已开始，2已激活-未开始，3-已结束
	 */
	private Integer status;
	/**
	 * 是否激活：0-未激活，1-已激活
	 */
	private Integer isActive;
	/**
	 * 活动链接
	 */
	private String activityUrl;
	/**
	 * 活动描述
	 */
	private String activityDescription;
	/**
	 * 创建人ID
	 */
	private Long creatorId;
	/**
	 * 创建人姓名
	 */
	private String creatorName;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 是否删除：0-未删除，1-已删除
	 */
	private Integer isDeleted;
	/**
	 * 是否为复制数据：0-原始数据，1-复制数据
	 */
	private Integer isCopied;
	/**
	 * 指定次数
	 */
	private Integer targetCount;
	/**
	 * 步骤
	 */
	private Integer isStep;
	/**
	 * 抽奖页面配置数据
	 */
	private String pageConfig;

}
