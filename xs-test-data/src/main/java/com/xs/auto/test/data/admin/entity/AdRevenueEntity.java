package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 广告收益表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_revenue")
public class AdRevenueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 广告商id
	 */
	private Long vendorId;
	/**
	 * 广告单元id
	 */
	private String unitId;
	/**
	 * 日期
	 */
	private Date date;
	/**
	 * 结算币种: 0-RMB, 1-USD
	 */
	private Integer currency;
	/**
	 * 展示次数/曝光次数
	 */
	private Integer impressions;
	/**
	 * 点击次数
	 */
	private Integer clicks;
	/**
	 * 点击率(%)
	 */
	private BigDecimal ctr;
	/**
	 * 填充率(%)
	 */
	private BigDecimal fillRate;
	/**
	 * 平均点击价格(元)
	 */
	private BigDecimal avgCpc;
	/**
	 * 播放次数
	 */
	private Integer plays;
	/**
	 * 播完次数
	 */
	private Integer finished;
	/**
	 * 完整观看率(%)
	 */
	private BigDecimal videoCompletionRate;
	/**
	 * 收益(美元)
	 */
	private BigDecimal revenue;
	/**
	 * 千次展示收益
	 */
	private BigDecimal ecpm;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 开发者分成(美元)
	 */
	private BigDecimal developerShare;
	/**
	 * 平台分成(美元)
	 */
	private BigDecimal platformShare;
	/**
	 * 结算状态: 0-未结算, 1-已结算
	 */
	private Integer settlementStatus;
	/**
	 * 结算时间
	 */
	private Date settlementTime;
	/**
	 * 请求数
	 */
	private Integer requests;
	/**
	 * 素材类型: 0-图片, 1-视频
	 */
	private Integer materialType;

}
