package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 渠道链接管理表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-17 16:59:47
 */
@Data
@TableName("ad_channel_links")
public class AdChannelLinksEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键，对应序号
	 */
	@TableId
	private Long id;
	/**
	 * 链接名称
	 */
	private String linkName;
	/**
	 * 渠道type 1、google 2、facebook
	 */
	private Integer channelType;
	/**
	 * 费用(美元)
	 */
	private BigDecimal costUsd;
	/**
	 * 识别码
	 */
	private String identificationCode;
	/**
	 * 状态：1-显示，0-隐藏
	 */
	private Integer status;
	/**
	 * 落地页
	 */
	private String lpurl;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
