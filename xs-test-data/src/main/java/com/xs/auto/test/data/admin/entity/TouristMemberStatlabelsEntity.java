package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 游客用户标签统计表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("tourist_member_statlabels")
public class TouristMemberStatlabelsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 游客用户ID
	 */
	private Long touristUserId;
	/**
	 * 标签名称
	 */
	private String tagName;
	/**
	 * 
	 */
	private Long tagId;

}
