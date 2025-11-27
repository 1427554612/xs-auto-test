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
 * @date 2025-09-17 16:59:47
 */
@Data
@TableName("tb_multilingual_response_message_33")
public class TbMultilingualResponseMessage33Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String messageCode;
	/**
	 * 
	 */
	private String languageType;
	/**
	 * 
	 */
	private String messageValue;
	/**
	 * 
	 */
	private String messagedefaultValue;
	/**
	 * 
	 */
	private Date createdAt;
	/**
	 * 
	 */
	private Date updatedAt;
	/**
	 * 
	 */
	private Long createBy;
	/**
	 * 
	 */
	private Long updatedBy;

}
