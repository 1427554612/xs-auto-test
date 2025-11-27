package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 多语言响应消息表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-17 16:59:47
 */
@Data
@TableName("tb_multilingual_response_message_copy2")
public class TbMultilingualResponseMessageCopy2Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 消息编码
	 */
	private String messageCode;
	/**
	 * 语言类型
	 */
	private String languageType;
	/**
	 * 消息内容
	 */
	private String messageValue;
	/**
	 * 消息内容（中文）
	 */
	private String messagedefaultValue;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 更新时间
	 */
	private Date updatedAt;
	/**
	 * 创建人
	 */
	private Long createBy;
	/**
	 * 更新人
	 */
	private Long updatedBy;

}
