package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 开发者竞价广告计划
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_campaign")
public class AdCampaignEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 模板ID
	 */
	private String templateId;
	/**
	 * 状态0:等待确认，1：未开始的计划，2：取消的计划，3：正在展示，4：结束状态，5：计划待定,6已删除
	 */
	private Integer status;
	/**
	 * 资金消耗
	 */
	private BigDecimal consumed;
	/**
	 * 新玩家数量
	 */
	private Long newPlayers;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 展示开始日期
	 */
	private Date displayStartDate;
	/**
	 * 展示结束日期
	 */
	private Date displayEndDate;
	/**
	 * 展示开始时间
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date displayStartTime;
	/**
	 * 展示结束时间
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date displayEndTime;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 预算价格
	 */
	private BigDecimal estimatedSpend;
	/**
	 * 用户ID
	 */
	private Long userId;

}
