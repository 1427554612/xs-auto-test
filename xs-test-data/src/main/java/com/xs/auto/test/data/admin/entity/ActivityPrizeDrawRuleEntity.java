package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 活动抽奖规则配置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_prize_draw_rule")
public class ActivityPrizeDrawRuleEntity implements Serializable {
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
	 * 抽奖次数
	 */
	private Integer lotteryCount;
	/**
	 *  抽奖形式 1-转盘，2-挂卡，3-宝箱
	 */
	private Integer lotteryFormat;
	/**
	 * 免费次数
	 */
	private Integer freeCount;
	/**
	 * 额外次数
	 */
	private Integer extraCount;
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
