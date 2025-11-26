package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 奖励配置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_reward")
public class ActivityRewardEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 奖励ID
	 */
	@TableId
	private Long id;
	/**
	 * 活动ID
	 */
	private Long activityId;
	/**
	 * 奖品id
	 */
	private Long activityPrizeId;
	/**
	 * 中奖概率（抽奖活动）
	 */
	private Integer rewardProbability;
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
	/**
	 * 关联任务ID
	 */
	private Long taskId;
	/**
	 * 关联阶梯任务奖励ID
	 */
	private Long taskRewardId;

}
