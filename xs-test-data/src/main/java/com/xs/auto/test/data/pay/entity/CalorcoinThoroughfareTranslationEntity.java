package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 流通类型表翻译表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("calorcoin_thoroughfare_translation")
public class CalorcoinThoroughfareTranslationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 翻译记录ID
	 */
	@TableId
	private Long id;
	/**
	 * 流通类型ID（关联calorcoin_thoroughfare.id）
	 */
	private Long thoroughfareId;
	/**
	 * 语言代码（如：en, zh-CN, ja等）
	 */
	private String languageCode;
	/**
	 * 商品名称（翻译）
	 */
	private String name;
	/**
	 * 描述（翻译）
	 */
	private String description;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 更新时间
	 */
	private Date updatedAt;
	/**
	 * 是否为默认0-否，1-是
	 */
	private Long isDefault;

}
