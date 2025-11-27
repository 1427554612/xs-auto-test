package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 奖品库存
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_prize_stock")
public class ActivityPrizeStockEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 奖品ID
	 */
	@TableId
	private Long id;
	/**
	 * 游戏id
	 */
	private Long gameId;
	/**
	 * 奖品编号
	 */
	private String prizeCode;
	/**
	 * 奖品类型：1-实物奖品，2-虚拟奖品
	 */
	private Integer prizeType;
	/**
	 * 虚拟类型：1-实物奖品，2-虚拟奖品CDKey，3-虚拟奖品兑换码，4-虚拟奖品热力币
	 */
	private Integer virtualType;
	/**
	 * 奖品单价（美金）
	 */
	private BigDecimal unitPrice;
	/**
	 * 奖品总数
	 */
	private BigDecimal totalQuantity;
	/**
	 * 已领取数量
	 */
	private BigDecimal claimedQuantity;
	/**
	 * 已兑换数量
	 */
	private BigDecimal exchangedQuantity;
	/**
	 * 剩余数量
	 */
	private BigDecimal remainingQuantity;
	/**
	 * 有效期类型：1-永久，2-领取后X天，3-固定日期
	 */
	private Integer validityType;
	/**
	 * 领取后有效天数
	 */
	private Integer validityDays;
	/**
	 * 有效期开始时间
	 */
	private Date validityStartTime;
	/**
	 * 有效期结束时间
	 */
	private Date validityEndTime;
	/**
	 * 状态：0-禁用，1-启用
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
	 * 创建人ID
	 */
	private Long createUserId;
	/**
	 * 更新人ID
	 */
	private Long updateUserId;
	/**
	 * 兑换地址
	 */
	private String exchangeAddress;
	/**
	 * 获奖时间
	 */
	private Date awardwinningTime;
	/**
	 * 活动ID
	 */
	private Long activityId;
	/**
	 * 礼包ID
	 */
	private Long giftId;
	/**
	 * 道具id
	 */
	private Long itemId;

}
