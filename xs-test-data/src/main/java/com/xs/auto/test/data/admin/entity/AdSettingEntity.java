package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 广告设置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_setting")
public class AdSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Integer id;
	/**
	 * 用户单日观看激励视频广告的最大数量
	 */
	private Integer dailyMaxOfRewardAds;
	/**
	 * 同一游戏模板广告间隔展示时间(秒)
	 */
	private Integer gameTemplateInterval;
	/**
	 * 网站横幅广告刷新展示时间(秒)
	 */
	private Integer webBannerRefreshInterval;
	/**
	 * 网站插屏广告间隔展示时间(秒)
	 */
	private Integer webInterstitialInterval;
	/**
	 * 游戏中场视频广告间隔展示时间(秒)
	 */
	private Integer midgameAdInterval;
	/**
	 * 修改时间
	 */
	private Date updateTime;

}
