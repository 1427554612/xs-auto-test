package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 自定义渠道管理表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-17 16:59:47
 */
@Data
@TableName("ad_channel")
public class AdChannelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键，对应序号
	 */
	@TableId
	private Long id;
	/**
	 * 渠道名称
	 */
	private String channelName;
	/**
	 * 状态：1-启用，0-禁用
	 */
	private Integer status;
	/**
	 * 操作人
	 */
	private Long operatorId;
	/**
	 * 创建人昵称
	 */
	private String nickname;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
