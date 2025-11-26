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
@TableName("sys_exchange_rate")
public class SysExchangeRateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键自增
	 */
	@TableId
	private Integer id;
	/**
	 * 汇率名称
	 */
	private String name;
	/**
	 * 汇率名称描述
	 */
	private String nameDesc;
	/**
	 * 需要转换的国家
	 */
	private String from;
	/**
	 * 转换的国家
	 */
	private String to;
	/**
	 * 汇率
	 */
	private BigDecimal price;
	/**
	 * 数据创建时间
	 */
	private Date createTime;

}
