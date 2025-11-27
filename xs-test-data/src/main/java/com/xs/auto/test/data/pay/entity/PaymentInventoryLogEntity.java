package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存日志表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("payment_inventory_log")
public class PaymentInventoryLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 商品ID
	 */
	private Long purchaseId;
	/**
	 * 库存ID
	 */
	private String stockno;
	/**
	 * 数量
	 */
	private Integer inventorynum;
	/**
	 * 操作类型
	 */
	private Integer acttype;
	/**
	 * 创建时间
	 */
	private Date createdAt;

}
