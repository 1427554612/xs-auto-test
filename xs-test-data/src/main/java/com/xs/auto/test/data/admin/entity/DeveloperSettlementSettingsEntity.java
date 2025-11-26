package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("developer_settlement_settings")
public class DeveloperSettlementSettingsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 结算货币
	 */
	private String settlementCurrency;
	/**
	 * 最低结算金额
	 */
	private BigDecimal settlementAmount;
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
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 操作人
	 */
	private String operator;

}
