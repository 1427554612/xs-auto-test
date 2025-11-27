package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 活动氛围用户表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_atmosphere_user")
public class ActivityAtmosphereUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 活动ID（关联现有活动表）
	 */
	private Long activityId;
	/**
	 * 奖品ID（关联现有奖品表）
	 */
	private Long activityPrizeId;
	/**
	 * 氛围用户昵称
	 */
	private String nickname;
	/**
	 * 氛围用户头像
	 */
	private String avatar;
	/**
	 * 获奖时间
	 */
	private Date winTime;
	/**
	 * 是否扣减库存（0-不扣减，1-扣减）
	 */
	private Integer deductStock;
	/**
	 * 状态（0-禁用，1-启用）
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 0-未扣减，1-已扣减
	 */
	private Integer isDeducted;

}
