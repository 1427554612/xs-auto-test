package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 奖品兑换码
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_prize_redemption_code")
public class ActivityPrizeRedemptionCodeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 奖品ID
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 奖品库ID（关联奖品库表）
	 */
	private Long prizeLibraryId;
	/**
	 * 兑换码
	 */
	private String redemptionCode;
	/**
	 * 状态：0-未领用，1-已领用
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

}
