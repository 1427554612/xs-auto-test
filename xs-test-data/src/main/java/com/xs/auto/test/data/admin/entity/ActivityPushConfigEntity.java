package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 推送配置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_push_config")
public class ActivityPushConfigEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 活动ID
	 */
	private Long activityId;
	/**
	 * 关联抽奖奖励ID
	 */
	private Long rewardId;
	/**
	 * 关联任务ID
	 */
	private Long taskId;
	/**
	 * 关联阶梯任务奖励ID
	 */
	private Long taskRewardId;
	/**
	 * 发送时机：1-立刻发送，2-定时发送
	 */
	private Integer sendType;
	/**
	 * 定时发送时间
	 */
	private Date sendTime;
	/**
	 * 推送位置：1-站内信，2-邮件
	 */
	private Integer pushPosition;
	/**
	 * 状态（0待推送、1发送成功、2发送失败）
	 */
	private Integer status;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
