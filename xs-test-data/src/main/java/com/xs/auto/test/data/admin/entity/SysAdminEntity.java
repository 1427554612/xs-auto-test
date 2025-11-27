package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("sys_admin")
public class SysAdminEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
	private String username;
	/**
	 * 密码（密文）
	 */
	private String password;
	/**
	 * 昵称（姓名）
	 */
	private String nickName;
	/**
	 * 备注信息
	 */
	private String note;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 帐号启用状态：0->禁用；1->启用; 2->锁定
	 */
	private Integer status;
	/**
	 * 上级id（创建人）
	 */
	private Long createBy;
	/**
	 * 
	 */
	private String contactMethod;
	/**
	 * 登录错误次数
	 */
	private Integer errorCount;
	/**
	 * 头像
	 */
	private String icon;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 最后登录时间
	 */
	private Long loginTime;
	/**
	 * 商户号
	 */
	private String merchant;
	/**
	 * 加密后的google验证器安全码
	 */
	private String secretKey;
	/**
	 * ip白名单，多个ip用英文逗号隔开
	 */
	private String ips;
	/**
	 * 电话号码前缀,账号地区
	 */
	private String countryCode;
	/**
	 * 手机
	 */
	private String phone;
	/**
	 * 是否开启手机验证,0:否  1:是
	 */
	private Integer phoneCodeOpen;
	/**
	 * 是否开启邮箱验证,0:否  1:是
	 */
	private Integer emailCodeOpen;
	/**
	 * 是否开启谷歌验证码验证 0:否  1:是
	 */
	private Integer googleCodeOpen;
	/**
	 * Google验证开关：0-关闭，1-开启
	 */
	private Integer googleAuthEnabled;
	/**
	 * 邮箱通知 0：否，1：是
	 */
	private Integer emailNotifyOpen;
	/**
	 * 短信通知 0：否，1：是
	 */
	private Integer smsNotifyOpen;
	/**
	 * 二次验证登陆 0：否，1：是
	 */
	private Integer quadraticVerifyLoginOpen;
	/**
	 * 上级id
	 */
	private Long superiorId;
	/**
	 * 资金密码
	 */
	private String safePassword;
	/**
	 * 恢复码
	 */
	private String recoveryCodes;

}
