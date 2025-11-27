package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 国家信息表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("countries")
public class CountriesEntity implements Serializable {
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
	 * 国家英文名称
	 */
	private String countryNameEn;
	/**
	 * 国家代码(ISO 3166-1 alpha-3)
	 */
	private String countryCode3;
	/**
	 * 排序权重
	 */
	private Integer sortOrder;
	/**
	 * 状态(1-启用 0-禁用)
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 更新时间
	 */
	private Date updatedAt;

}
