package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * H5页面表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("h5_page")
public class H5PageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 页面ID
	 */
	@TableId
	private Long id;
	/**
	 * 页面名称
	 */
	private String pageName;
	/**
	 * 页面封面
	 */
	private String pageCover;
	/**
	 * 导航颜色
	 */
	private String navColor;
	/**
	 * 背景样式
	 */
	private String backgroundStyle;
	/**
	 * 转发文案
	 */
	private String shareText;
	/**
	 * 转发封面
	 */
	private String shareCover;
	/**
	 * 回访链接
	 */
	private String returnUrl;
	/**
	 * 页面内容（JSON格式）
	 */
	private String pageContent;
	/**
	 * 状态：0-草稿，1-已发布，2-已下架
	 */
	private Integer status;
	/**
	 * 创建人ID
	 */
	private Long creatorId;
	/**
	 * 创建人姓名
	 */
	private String creatorName;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 是否删除：0-未删除，1-已删除
	 */
	private Integer isDeleted;

}
