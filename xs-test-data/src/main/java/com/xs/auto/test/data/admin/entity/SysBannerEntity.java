package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * banner表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("sys_banner")
public class SysBannerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 展示的顺序
	 */
	private Long orderNo;
	/**
	 * 状态（0显示中 1已下架 2待显示)
	 */
	private Integer status;
	/**
	 * 标题
	 */
	private String bannerTitle;
	/**
	 * 链接
	 */
	private String bannerLinks;
	/**
	 * 展示规则(0长期展示 1定时展示）
	 */
	private Integer bannerTimeRule;
	/**
	 * 展示开始时间
	 */
	private Date bannerTimeStart;
	/**
	 * 展示结束时间
	 */
	private Date bannerTimeEnd;
	/**
	 * banner背景图URL
	 */
	private String bannerBackgroundImage;
	/**
	 * 素材图片URL
	 */
	private String bannerImage;
	/**
	 * 记录创建时间
	 */
	private Date createdAt;
	/**
	 * 记录最后更新时间
	 */
	private Date updatedAt;
	/**
	 * 记录创建人员
	 */
	private Long createBy;
	/**
	 * 记录更新人员
	 */
	private Long updatedBy;

}
