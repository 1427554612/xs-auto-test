package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 热力币记录
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("calorcoin_detail")
public class CalorcoinDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 流通类型明细ID
	 */
	private Long calorcoinTypeId;
	/**
	 * 类型ID
	 */
	private Long thoroughfareId;
	/**
	 * 转出的账号1平台2玩家3开发者
	 */
	private Integer paySource;
	/**
	 * 收款方1平台2玩家3开发者
	 */
	private Integer payTarget;
	/**
	 * 用户身份
	 */
	private Integer userType;
	/**
	 * 数量
	 */
	private BigDecimal calorcoinNum;
	/**
	 * 状态1 成功，0失败
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 转出账号名称
	 */
	private String paySourceAccount;
	/**
	 * 转入账号名称
	 */
	private String payTargetAccount;
	/**
	 * 交易状态 0:转出，1转入，2回收
	 */
	private Integer payType;
	/**
	 * 币种 0:热力币，1:抵扣金
	 */
	private Integer currencyType;
	/**
	 * 奖励ID
	 */
	private Long rewardId;
	/**
	 * 活动ID
	 */
	private Long activityId;

}
