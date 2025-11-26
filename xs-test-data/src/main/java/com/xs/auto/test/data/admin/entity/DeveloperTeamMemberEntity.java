package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 开发者账号白名单表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("developer_team_member")
public class DeveloperTeamMemberEntity implements Serializable {
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
	 * 注册用户
	 */
	private String teamUserId;
	/**
	 * 备注
	 */
	private String notes;
	/**
	 * 增加时间
	 */
	private Date createAt;

}
