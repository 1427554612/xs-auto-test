package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品价格套餐表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("game_purchase_promotional")
public class GamePurchasePromotionalEntity implements Serializable {
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
	 * 时区
	 */
	private String timezone;
	/**
	 * 开始日期
	 */
	private Date startTime;
	/**
	 * 结束日期
	 */
	private Date endTime;
	/**
	 * 是否无结束日期：0否，1是
	 */
	private Integer isDateuntil;
	/**
	 * 币种
	 */
	private String currency;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 是否开启当地折扣价：0否，1是
	 */
	private Integer isLocaldiscountedprice;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 国家列表
	 */
	private String countryList;
	/**
	 * 套餐sku
	 */
	private String proSku;
	/**
	 * 套餐抵扣sku
	 */
	private String coSku;

}
