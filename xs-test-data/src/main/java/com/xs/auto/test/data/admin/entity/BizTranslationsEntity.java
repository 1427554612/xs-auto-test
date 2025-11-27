package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 多语言翻译信息
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("biz_translations")
public class BizTranslationsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 翻译记录的唯一标识符
	 */
	@TableId
	private Long id;
	/**
	 * 业务类型
	 */
	private String bizCode;
	/**
	 * 业务ID
	 */
	private Long bizId;
	/**
	 * 语言代码，如：en, zh-CN, zh-TW等
	 */
	private String languageCode;
	/**
	 * 属性
	 */
	private String attrCode;
	/**
	 * 属性值
	 */
	private String attrValue;

}
