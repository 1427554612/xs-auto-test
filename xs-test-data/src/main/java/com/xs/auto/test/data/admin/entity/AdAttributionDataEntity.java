package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 广告归因数据表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_attribution_data")
public class AdAttributionDataEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 渠道链接ID，关联ad_channel_links表
	 */
	private Long channelLinkId;
	/**
	 * 渠道类型：1-Google，2-Facebook
	 */
	private Integer channelType;
	/**
	 * 识别码
	 */
	private String identificationCode;
	/**
	 * 广告系列ID
	 */
	private String campaignId;
	/**
	 * 广告组ID
	 */
	private String adGroupId;
	/**
	 * 广告ID
	 */
	private String adId;
	/**
	 * 报告日期
	 */
	private Date reportDate;
	/**
	 * 曝光次数
	 */
	private Long impressions;
	/**
	 * 点击次数
	 */
	private Long clicks;
	/**
	 * 消耗金额（美元）
	 */
	private BigDecimal costUsd;
	/**
	 * 点击率
	 */
	private BigDecimal ctr;
	/**
	 * 平均点击成本
	 */
	private BigDecimal cpc;
	/**
	 * 千次曝光成本
	 */
	private BigDecimal cpm;
	/**
	 * 转化次数
	 */
	private Long conversions;
	/**
	 * 转化率
	 */
	private BigDecimal conversionRate;
	/**
	 * 单次转化成本
	 */
	private BigDecimal costPerConversion;
	/**
	 * 数据来源：GOOGLE_ADS, FACEBOOK_ADS
	 */
	private String dataSource;
	/**
	 * 原始API返回数据（JSON格式）
	 */
	private String rawData;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
