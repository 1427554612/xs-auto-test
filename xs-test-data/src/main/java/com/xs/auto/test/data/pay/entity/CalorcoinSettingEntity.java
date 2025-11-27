package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 热力币设置
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("calorcoin_setting")
public class CalorcoinSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Integer id;
	/**
	 * 手续费设置开关，0关闭，1开启
	 */
	private Integer feeSetting;
	/**
	 * 支付金额占比

	 */
	private Double paymentAmountRatio;
	/**
	 * 热力币
	 */
	private Double hotCurrency;
	/**
	 * 消费抵扣设置开关，0关闭，1开启
	 */
	private Integer consumptionDeductionSetting;
	/**
	 * 最小的抵扣比例
	 */
	private Integer deductionMin;
	/**
	 * 最大的抵扣比例
	 */
	private Integer deductionMax;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 更新人
	 */
	private String updateBy;
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
