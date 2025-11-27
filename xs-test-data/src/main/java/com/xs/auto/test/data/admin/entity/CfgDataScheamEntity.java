package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 数据字典-数值表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("cfg_data_scheam")
public class CfgDataScheamEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 名称-Key
	 */
	private String name;
	/**
	 * 翻译的文案
	 */
	private String remark;
	/**
	 * 字典类型编码
	 */
	private String dataTypeCode;
	/**
	 * 排序数值
	 */
	private Integer sortNum;
	/**
	 * 是否启用,1-启用；0-禁用
	 */
	private Integer status;
	/**
	 * 枚举值
	 */
	private String value;

}
