package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * H5页面多语言表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("h5_page_language")
public class H5PageLanguageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 页面ID
	 */
	private Long pageId;
	/**
	 * 语言代码
	 */
	private String languageCode;
	/**
	 * 页面名称
	 */
	private String pageName;
	/**
	 * 转发文案
	 */
	private String shareText;
	/**
	 * 页面内容（JSON格式）
	 */
	private String pageContent;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
