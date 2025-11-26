package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 广告服务商表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_vendor")
public class AdVendorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 服务商名称
	 */
	private String vendorName;
	/**
	 * 支持的广告类型，如Banner广告、插屏广告、视频广告等
	 */
	private String adTypes;
	/**
	 * 结算方式：0 CPM-千次展示，1 CPC-点击计费，2 CPA-行为计费
	 */
	private Integer billingMethod;
	/**
	 * 状态：0-禁用，1-启用
	 */
	private Integer status;
	/**
	 * 服务商描述
	 */
	private String description;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 更新人
	 */
	private String updateBy;

}
