package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 推广计划模板表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("promote_campaign_template")
public class PromoteCampaignTemplateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 模板ID
	 */
	private String templateId;
	/**
	 * 开发者ID
	 */
	private Long developerId;
	/**
	 * 游戏ID
	 */
	private Long gameId;
	/**
	 * 关联的games_version记录ID（用于审批）
	 */
	private Long versionId;
	/**
	 * 模板名称
	 */
	private String templateName;
	/**
	 * 发布开始日期
	 */
	private Date releaseDateStart;
	/**
	 * 发布结束日期
	 */
	private Date releaseDateEnd;
	/**
	 * 广告时段类型：ALL_DAY,TIMING
	 */
	private String advertisingPeriodType;
	/**
	 * 广告时段时间，当advertising_period_type为TIMING时不能为空
	 */
	private String advertisingPeriodTime;
	/**
	 * 广告开始时间
	 */
	private Date advertisingStartTime;
	/**
	 * 广告结束时间
	 */
	private Date advertisingEndTime;
	/**
	 * 广告位置：WEBSITE_INTERSTITIAL,GAME_INCENTIVE,BANNER_ADS,GAME_BANNER,MID_GAME_INTERSTITIAL,RECOMMENDED_GAMES
	 */
	private String resourceLocation;
	/**
	 * 计费方式：CPM,CPC
	 */
	private String consumptionRule;
	/**
	 * CPM价格
	 */
	private BigDecimal price;
	/**
	 * 预估花费（CC抵扣金）
	 */
	private BigDecimal estimatedSpend;
	/**
	 * 展示位置
	 */
	private String displayLocation;
	/**
	 * 素材类型：PICTURE,VIDEO
	 */
	private String materialType;
	/**
	 * 广告素材url（图片、视频、文案等）
	 */
	private String materialFileUrl;
	/**
	 * 状态：-1-待发起审批，0-待审核，1-审核通过，2-审核不通过，3-审批中,5-删除
	 */
	private Integer status;
	/**
	 * 驳回理由
	 */
	private String rejectReason;
	/**
	 * 审核人ID
	 */
	private Long reviewerId;
	/**
	 * 审核时间
	 */
	private Date reviewTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 推广计划执行状态：0-活跃，1-正在展示，2-已取消，3-已结束
	 */
	private Long campaignStatus;

}
