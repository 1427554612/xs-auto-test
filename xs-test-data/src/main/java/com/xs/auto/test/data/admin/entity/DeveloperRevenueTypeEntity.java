package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("developer_revenue_type")
public class DeveloperRevenueTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 收益类型编号，自增
	 */
	@TableId
	private Integer revenueId;
	/**
	 * 收益类型名称
	 */
	private String revenueName;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 修改时间
	 */
	private Date updateTime;

}
