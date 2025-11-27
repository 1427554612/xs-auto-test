package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户角色表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("sys_role")
public class SysRoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 启用状态：0->禁用；1->启用
	 */
	private Integer status;
	/**
	 * 
	 */
	private Long createBy;
	/**
	 * 后台用户数量
	 */
	private Integer adminCount;
	/**
	 * 
	 */
	private Integer sort;
	/**
	 * 商户号
	 */
	private String merchant;
	/**
	 * 资源所属，1：后台，2：商户，3：c端，4：钱包商户
	 */
	private Integer belong;
	/**
	 * 是否默认权限（每个资源所属只有一个默认角色 )
	 */
	private Integer isDefault;

}
