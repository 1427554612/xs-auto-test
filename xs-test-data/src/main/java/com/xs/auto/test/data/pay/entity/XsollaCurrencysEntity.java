package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * xsolla支持的货币
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("xsolla_currencys")
public class XsollaCurrencysEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 国家名
	 */
	private String name;
	/**
	 * ISO 4217币种
	 */
	private String currency;
	/**
	 * ISO 4217两字母代码
	 */
	private String currencyIso;
	/**
	 * 精度
	 */
	private Integer accuracy;
	/**
	 * 对应cfg_data_scheam的name字段
	 */
	private String cfgName;

}
