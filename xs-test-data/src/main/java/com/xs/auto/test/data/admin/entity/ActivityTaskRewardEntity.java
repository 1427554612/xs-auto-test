package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 规则-阶梯任务阶段奖励
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_task_reward")
public class ActivityTaskRewardEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 奖励
	 */
	private BigDecimal reward;
	/**
	 * 活动ID
	 */
	private Long activityId;
	/**
	 * 操作人
	 */
	private Long operatorId;
	/**
	 * 排序
	 */
	private Integer sort;

}
