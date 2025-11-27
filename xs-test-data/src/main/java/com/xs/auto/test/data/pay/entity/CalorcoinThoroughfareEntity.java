package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 流通类型表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("calorcoin_thoroughfare")
public class CalorcoinThoroughfareEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 1：平台官方2：玩家3：开发者4：平台主账号:5：运营推广账号
	 */
	private String paySource;
	/**
	 * 1：平台官方2：玩家3：开发者4：平台主账号:5：运营推广账号
	 */
	private String payTarget;
	/**
	 * 状态1 正常，0禁用
	 */
	private String status;
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
	 * 是否删除，1删除，0未删除
	 */
	private Integer deleteFlag;

}
