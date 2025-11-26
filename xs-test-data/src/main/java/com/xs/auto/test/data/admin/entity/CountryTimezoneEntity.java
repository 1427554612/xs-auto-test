package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 国家时区映射表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("country_timezone")
public class CountryTimezoneEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 国家代码(ISO 3166-1 alpha-2)
	 */
	private String countryCode;
	/**
	 * 国家名称
	 */
	private String countryName;
	/**
	 * 时区ID (例: Asia/Shanghai)
	 */
	private String timezoneId;
	/**
	 * 时区名称描述
	 */
	private String timezoneName;
	/**
	 * GMT偏移量 (例: +08:00)
	 */
	private String gmtOffset;
	/**
	 * 状态(1-启用 0-禁用)
	 */
	private Integer isActive;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 更新时间
	 */
	private Date updatedAt;

}
