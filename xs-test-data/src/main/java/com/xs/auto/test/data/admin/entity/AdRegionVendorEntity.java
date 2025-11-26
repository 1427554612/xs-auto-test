package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 广告区域-服务商关联表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_region_vendor")
public class AdRegionVendorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 广告区域ID
	 */
	private Long regionId;
	/**
	 * 广告服务商ID
	 */
	private Long vendorId;
	/**
	 * 服务商排序，值越小越靠前
	 */
	private Integer sortOrder;

}
