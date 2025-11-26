package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 错误码配置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("i18n_error_code")
public class I18nErrorCodeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 自定义返回码
	 */
	private String errorCode;
	/**
	 * 中文描述
	 */
	private String messageCn;
	/**
	 * 英文描述
	 */
	private String messageEn;
	/**
	 * 香港繁体描述
	 */
	private String messageHk;
	/**
	 * 状态：0-禁用, 1-启用
	 */
	private Integer status;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 使用类型，1：客户端，2：后台管理系统
	 */
	private Integer useFor;

}
