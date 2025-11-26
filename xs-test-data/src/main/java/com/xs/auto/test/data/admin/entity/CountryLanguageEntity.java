package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 国家语言关系表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("country_language")
public class CountryLanguageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 国家名称
	 */
	private String countryName;
	/**
	 * 语言，如：德语，英语
	 */
	private String language;
	/**
	 * 语言编码，如：zh-CN，en
	 */
	private String languageCode;
	/**
	 * 语言别名，如：EN_DK，EN_BZ
	 */
	private String languageAlias;

}
