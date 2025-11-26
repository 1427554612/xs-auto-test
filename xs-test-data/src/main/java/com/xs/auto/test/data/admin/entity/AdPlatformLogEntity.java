package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 平台广告记录表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_platform_log")
public class AdPlatformLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 平台广告id
	 */
	private Long adPlatformId;
	/**
	 * 触发的用户
	 */
	private String triggerBy;
	/**
	 * 触发类型：1加载，2点击
	 */
	private Integer triggerType;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
