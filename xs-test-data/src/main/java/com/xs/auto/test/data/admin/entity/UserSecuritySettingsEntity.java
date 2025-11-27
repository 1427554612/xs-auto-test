package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户安全设置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_security_settings")
public class UserSecuritySettingsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 谷歌验证开关：0-关闭，1-开启
	 */
	private Integer googleAuthEnabled;
	/**
	 * 邮箱验证开关：0-关闭，1-开启
	 */
	private Integer emailAuthEnabled;
	/**
	 * 登录密码开关：0-关闭，1-开启
	 */
	private Integer loginPasswordEnabled;
	/**
	 * 用户登录开关：0-关闭，1-开启
	 */
	private Integer userLoginEnabled;
	/**
	 * 最后操作的管理员ID
	 */
	private Long adminId;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 更新时间
	 */
	private Date updatedAt;
	/**
	 *  是否为管理员端设置：0-Web端，1-Admin端
	 */
	private Long isAdmin;
	/**
	 * 是否绑定了谷歌验证
	 */
	private Long twoFactorEnabled;

}
