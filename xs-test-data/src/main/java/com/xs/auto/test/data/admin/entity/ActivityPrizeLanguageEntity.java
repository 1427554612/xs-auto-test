package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 奖品库存多语言表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_prize_language")
public class ActivityPrizeLanguageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 奖品库存ID
	 */
	private Long activityPrizeStockId;
	/**
	 * 语言代码：zh-CN, en-US等
	 */
	private String languageCode;
	/**
	 * 奖品名称
	 */
	private String prizeName;
	/**
	 * 奖品图片URL
	 */
	private String imageUrl;
	/**
	 * 奖品描述
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

}
