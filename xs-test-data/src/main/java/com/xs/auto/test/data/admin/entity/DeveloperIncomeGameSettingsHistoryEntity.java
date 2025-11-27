package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 游戏收益分配设置历史操作表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("developer_income_game_settings_history")
public class DeveloperIncomeGameSettingsHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Integer historyId;
	/**
	 * 游戏ID
	 */
	private Long gameId;
	/**
	 * 买断游戏收益比率-平台
	 */
	private BigDecimal buyPlatform;
	/**
	 * 买断游戏收益比率-开发者
	 */
	private BigDecimal buyDeveloper;
	/**
	 * 买断游戏收益比率-通道费
	 */
	private BigDecimal buyThoroughfare;
	/**
	 * 内购游戏收益比率-平台
	 */
	private BigDecimal appPlatform;
	/**
	 * 内购游戏收益比率-开发者
	 */
	private BigDecimal appDeveloper;
	/**
	 * 内购游戏收益比率-通道费
	 */
	private BigDecimal appThoroughfare;
	/**
	 * 预付款
	 */
	private BigDecimal advancePayment;
	/**
	 * 已抵扣预付款
	 */
	private BigDecimal useAdvancePayment;
	/**
	 * 操作时间
	 */
	private Date operateTime;
	/**
	 * 操作人ID
	 */
	private String operatorId;
	/**
	 * 是否开启预付款扣减,0:关闭，1开启
	 */
	private Integer enableDeduction;
	/**
	 * 分配规则，0：代表使用定制化规则，1代表使用平台统一规则
	 */
	private Integer allocationRules;

}
