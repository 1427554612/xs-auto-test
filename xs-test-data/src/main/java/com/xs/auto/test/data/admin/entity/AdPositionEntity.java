package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 广告位表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_position")
public class AdPositionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 广告位名称
	 */
	private String positionName;
	/**
	 * 触发规则：例如打开页面
	 */
	private String triggerRule;
	/**
	 * 素材类型：0.image-图片，1.视频
	 */
	private String materialTypes;
	/**
	 * 广告位类型：0-游戏激励视频广告1-网站激励视频广告(网站插屏广告)2-网站横幅广告3-游戏横幅广告4-中场视频广告
	 */
	private Integer adType;
	/**
	 * 智能切换服务商：0-不切换 1-累计切换，2-定时切换
	 */
	private Integer changeVendor;
	/**
	 * 触发次数
	 */
	private Integer triggerTimers;
	/**
	 * 触发间隔：单位s
	 */
	private Integer triggerPeriod;
	/**
	 * 重置时间：单位s
	 */
	private Integer repeatPeriod;
	/**
	 * 收益分配方式：0.不分成 1固定，2阶梯，3dau阶梯
	 */
	private Integer revenueModel;
	/**
	 * 通道费
	 */
	private BigDecimal fixChannelRate;
	/**
	 * 平台
	 */
	private BigDecimal fixPlatformRate;
	/**
	 * 开发者
	 */
	private BigDecimal fixDeveloperRate;
	/**
	 * 阶梯通道费
	 */
	private BigDecimal tierChannelRate;
	/**
	 * 阶梯规则：list<map>  key为范围，value为百分比
	 */
	private String tierRule;
	/**
	 * dau通道费
	 */
	private BigDecimal dauChannelRate;
	/**
	 * dau阶梯规则：list<map>  key为范围，value为百分比
	 */
	private String dauRule;
	/**
	 * 生效时间
	 */
	private Date effectiveTime;
	/**
	 * 状态：0-禁用，1-启用
	 */
	private Integer status;
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
	/**
	 * CPM金额
	 */
	private BigDecimal cpmPrice;
	/**
	 * CPC金额
	 */
	private BigDecimal cpcPrice;

}
