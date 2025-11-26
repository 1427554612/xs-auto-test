package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存记录表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("payment_inventory")
public class PaymentInventoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 游戏ID
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
	 * 状态0 冻结 1释放 2扣减
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createdAt;

}
