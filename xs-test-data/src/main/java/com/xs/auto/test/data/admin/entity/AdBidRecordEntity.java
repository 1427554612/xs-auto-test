package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 广告竞价记录
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_bid_record")
public class AdBidRecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 广告批次
	 */
	private String adBatch;
	/**
	 * 广告位置-外键ad_position
	 */
	private Long adPositionId;
	/**
	 * 广告实际开始时间
	 */
	private Date advertisingStartTime;
	/**
	 * 广告实际结束时间
	 */
	private Date advertisingEndTime;
	/**
	 * 开发者竞价计划ID
	 */
	private Long adCampaignId;
	/**
	 * 0失败：1成功
	 */
	private Integer status;
	/**
	 * 0：禁用，1启用
	 */
	private Integer statusType;
	/**
	 * 花费金额
	 */
	private BigDecimal spend;
	/**
	 *  素材质量分（0-100分）
	 */
	private BigDecimal materialQualityScore;
	/**
	 * 游戏表现分
	 */
	private BigDecimal gamePerformanceScore;
	/**
	 * 平台推荐分（0-100分）
	 */
	private BigDecimal platformRecommendationScore;
	/**
	 * 最终竞价得分
	 */
	private BigDecimal finalBidScore;
	/**
	 * 是否结算，0：未结算，1结算
	 */
	private Integer isSettlement;
	/**
	 * 剩余曝光次数
	 */
	private Long remainingExposureCount;
	/**
	 * 剩余点击次数
	 */
	private Long remainingClickCount;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
