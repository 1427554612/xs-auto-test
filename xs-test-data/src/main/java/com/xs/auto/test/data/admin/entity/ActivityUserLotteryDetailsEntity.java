package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 活动-用户抽奖记录
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_user_lottery_details")
public class ActivityUserLotteryDetailsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId(type= IdType.AUTO)
	private Long id;
	/**
	 * 活动ID
	 */
	private Long activityId;
	/**
	 * 任务ID
	 */
	private Long taskId;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 用户账号/邮箱地址
	 */
	private String account;
	/**
	 * 奖励热力币数
	 */
	private BigDecimal calorcoinNum;
	/**
	 * 奖品ID（关联activity_prize_stock表）
	 */
	private Long prizeId;
	/**
	 * 创建时间
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	/**
	 * 更新时间
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

}
