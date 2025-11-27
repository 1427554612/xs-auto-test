package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台资源表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("sys_res")
public class SysResEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 父级ID
	 */
	private Long parentId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 资源类型 1：大菜单，2：小菜单，3：Tab页，4：操作
	 */
	private Integer type;
	/**
	 * 资源级数
	 */
	private Integer level;
	/**
	 * 资源名称
	 */
	private String name;
	/**
	 * 资源名称
	 */
	private String title;
	/**
	 * 资源链接
	 */
	private String url;
	/**
	 * 资源排序
	 */
	private Integer sort;
	/**
	 * 前端图标
	 */
	private String icon;
	/**
	 * 前端隐藏
	 */
	private Integer hidden;
	/**
	 * 资源所属，1：后台，2：商户，3：c端
	 */
	private Integer belong;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 需要上级确认 0:否，1:是
	 */
	private Integer superiorConfirm;
	/**
	 * 需要自己确认 0:否，1:是
	 */
	private Integer selfConfirm;
	/**
	 * 是否属于商户配制（0：默认全部，1：是）
	 */
	private Integer belongMerchant;

}
