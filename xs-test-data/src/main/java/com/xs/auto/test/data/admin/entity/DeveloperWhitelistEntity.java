package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 开发者IP白名单表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("developer_whitelist")
public class DeveloperWhitelistEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 开发者用户ID
	 */
	private Long developerUserId;
	/**
	 * 白名单ip
	 */
	private String ip;
	/**
	 * 备注
	 */
	private String notes;
	/**
	 * 增加时间
	 */
	private Date createAt;

}
