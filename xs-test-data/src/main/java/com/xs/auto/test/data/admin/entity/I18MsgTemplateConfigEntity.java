package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 消息模板配置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("i18_msg_template_config")
public class I18MsgTemplateConfigEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 标题(简体)
	 */
	private String title;
	/**
	 * 标题(繁体)
	 */
	private String titleHk;
	/**
	 * 标题(英文)
	 */
	private String titleEn;
	/**
	 * 内容(简体)
	 */
	private String content;
	/**
	 * 内容(繁体)
	 */
	private String contentHk;
	/**
	 * 内容(英文)
	 */
	private String contentEn;
	/**
	 * 消息类型 1:邮件，2:短信,3:站内信
	 */
	private Integer type;
	/**
	 * 启用状态，1：启用，0：不启用
	 */
	private Integer enable;
	/**
	 * 模板说明
	 */
	private String description;
	/**
	 * 是否支持富文本。0：不支持，1：支持
	 */
	private Integer richTextSupport;
	/**
	 * 是否弹窗（0不弹窗，1弹窗显示在消息记录，2弹窗不显示在消息记录）
	 */
	private Integer isPopupWindow;
	/**
	 * 用途
	 */
	private Integer usage;

}
