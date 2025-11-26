package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import lombok.Data;

/**
 * 广告竞价策略配置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_bid_setting")
public class AdBidSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 出价预算权重系数α（%）
	 */
	private Integer bidBudgetWeight;
	/**
	 * 游戏飙戏权重系数β（%）
	 */
	private Integer gamePerformanceWeight;
	/**
	 * 广告素材质量权重系数γ（%）
	 */
	private Integer creativeQualityWeight;
	/**
	 * 平台推荐权重系数δ（%）
	 */
	private Integer platformRecommendWeight;
	/**
	 * 批次预算权重系数θ（%）
	 */
	private Integer batchBudgetWeight;
	/**
	 * 游戏表现统计周期（天）
	 */
	private Integer gamePerformancePeriod;
	/**
	 * 时段调整因子ε（%）
	 */
	private Integer timeAdjustFactor;
	/**
	 * 分类推荐系数（如 {"SAG":10,"SLG":8} ）
	 */
	private Map<String,Integer> categoryCoffs;
	/**
	 * 标签推荐系数，如 {"汽车":9,"飞机":8}
	 */
	private Map<String,Integer> tagCoffs;
	/**
	 * 高峰时段系数（在线用户数 > 日均80%）
	 */
	private Integer peakHourCoeff;
	/**
	 * 平缓时段系数（日均20%-80%）
	 */
	private Integer flatHourCoeff;
	/**
	 * 低谷时段系数（在线用户数 ≤ 日均20%）
	 */
	private Integer troughHourCoeff;
	/**
	 * 创建人
	 */
	private String creator;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
