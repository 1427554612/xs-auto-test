package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 数据字典-类型表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("cfg_data_type")
public class CfgDataTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 字典类型编码
	 */
	private String dataTypeCode;
	/**
	 * 语言类型
	 */
	private String languageType;
	/**
	 * 字典类型说明
	 */
	private String remark;
	/**
	 * 类型
	 */
	private String cfgType;

}
