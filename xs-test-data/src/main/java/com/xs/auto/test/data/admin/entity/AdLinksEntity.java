package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 自定义链接管理表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-17 16:59:47
 */
@Data
@TableName("ad_links")
public class AdLinksEntity implements Serializable {
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
	 * 渠道_id
	 */
	private Long channelId;
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
	 * 活动
	 */
	private String campaign;
	/**
	 * 广告分组
	 */
	private String adgroup;
	/**
	 * 创意追踪
	 */
	private String creative;
	/**
	 * jogos点击id
	 */
	private Long jclid;
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
