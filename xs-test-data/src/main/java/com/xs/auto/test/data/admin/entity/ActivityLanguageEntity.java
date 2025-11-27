package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
@TableName("activity_language")
public class ActivityLanguageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 活动ID
	 */
	@TableId
	private Long id;
	/**
	 * 活动ID
	 */
	private Long activityId;
	/**
	 * 语言代码
	 */
	private String languageCode;
	/**
	 * 活动名称
	 */
	private String activityName;
	/**
	 * 按钮名称
	 */
	private String buttonName;
	/**
	 * 活动封面
	 */
	private String activityCover;
	/**
	 * 是否默认配置：0-非默认，1-默认
	 */
	private Integer isDefault;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
