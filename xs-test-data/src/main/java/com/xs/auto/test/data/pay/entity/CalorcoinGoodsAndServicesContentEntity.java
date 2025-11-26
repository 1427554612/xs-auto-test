package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品/服务 多语言 内容信息
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("calorcoin_goods_and_services_content")
public class CalorcoinGoodsAndServicesContentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 商品/服务id
	 */
	private Long goodsId;
	/**
	 * 语言代码，如：en, zh-CN, zh-TW等
	 */
	private String languageCode;
	/**
	 * 语言名称
	 */
	private String languageName;
	/**
	 * 商品名称
	 */
	private String goodsName;
	/**
	 * 商品描述
	 */
	private String goodsDescribe;

}
