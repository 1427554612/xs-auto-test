package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务配置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_task")
public class ActivityTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 任务ID
	 */
	@TableId
	private Long id;
	/**
	 * 活动ID
	 */
	private Long activityId;
	/**
	 * 0:次数任务，1阶梯任务
	 */
	private Integer taskType;
	/**
	 * 任务顺序
	 */
	private Integer taskOrder;
	/**
	 * 增加能量（阶梯任务）
	 */
	private Integer energyReward;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 操作人
	 */
	private Long operatorId;

}
