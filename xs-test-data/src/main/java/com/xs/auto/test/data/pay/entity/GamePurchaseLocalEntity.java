package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 本地价格设置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("game_purchase_local")
public class GamePurchaseLocalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 买断价格设置表ID
	 */
	private Long purchaseid;
	/**
	 * 国家或地区
	 */
	private String country;
	/**
	 * 币种
	 */
	private String currency;
	/**
	 * 价格
	 */
	private BigDecimal price;

}
