package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 活动用户奖品表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_user_prize")
public class ActivityUserPrizeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 奖品ID（关联activity_prize_stock表）
	 */
	private Long prizeId;
	/**
	 * 奖品状态：1-可使用，2-已使用，3-已失效
	 */
	private Integer status;
	/**
	 * 奖品类型  1-实物奖品，2-虚拟奖品CDKey，3-虚拟奖品兑换码，4-虚拟奖品热力币,5-道具
	 */
	private Integer prizeType;
	/**
	 * 获奖方式  1-抽奖/开宝箱/刮卡，2-任务/阶梯任务
	 */
	private Integer awardWinningMethod;
	/**
	 * 获奖时间
	 */
	private Date awardWinningTime;
	/**
	 * 过期时间
	 */
	private Date expireTime;
	/**
	 * 使用时间
	 */
	private Date useTime;
	/**
	 * 跳转游戏专用，games表数据
	 */
	private String handleName;
	/**
	 * 热力币/兑换码/CDkey/道具
	 */
	private String exchangeCode;
	/**
	 * 兑换平台
	 */
	private String exchangePlatform;
	/**
	 * 发货状态：1-待发货，2-已发货
	 */
	private Integer shippingStatus;
	/**
	 * 快递单号
	 */
	private String trackingNumber;
	/**
	 * 发货时间
	 */
	private Date shippingTime;
	/**
	 * 收货人姓名
	 */
	private String receiverName;
	/**
	 * 联系电话
	 */
	private String receiverPhone;
	/**
	 * 邮箱地址
	 */
	private String receiverEmail;
	/**
	 * 兑换时间
	 */
	private Date redemptionTime;
	/**
	 * 所在地区
	 */
	private String receiverRegion;
	/**
	 * 详细地址
	 */
	private String receiverAddress;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 用户账号/邮箱地址
	 */
	private String account;
	/**
	 * 发送消息时间
	 */
	private Date sendTime;
	/**
	 * 活动ID
	 */
	private Long activityId;
	/**
	 * 礼包ID
	 */
	private Long giftId;
	/**
	 * 奖励ID
	 */
	private Long rewardId;

}
