package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户会员表(核心数据，安全设置请查询user_security_settings表)
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_member")
public class UserMemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@TableId
	private Long userId;
	/**
	 * 账号/邮箱地址
	 */
	private String account;
	/**
	 * 用户code，与游客用户绑定
	 */
	private String userCode;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 密码盐
	 */
	private String salt;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 性别（0:女, 1:男）
	 */
	private Integer gender;
	/**
	 * 状态（0待激活, 1激活, 3删除提交, -1删除）
	 */
	private Integer status;
	/**
	 * 默认头像
	 */
	private String defaultAvatar;
	/**
	 * 上传头像地址
	 */
	private String avatarUrl;
	/**
	 * 注册时间
	 */
	private Date registrationTime;
	/**
	 * 背景图片
	 */
	private String backgroundImage;
	/**
	 * 用户所在国家
	 */
	private String location;
	/**
	 * 开发者状态（0待激活, 1激活）
	 */
	private Integer developerStatus;
	/**
	 * 邮件激活时间
	 */
	private Date activateTime;
	/**
	 * 加密后的Google验证器安全码
	 */
	private String secretKey;
	/**
	 * 2FA恢复代码(JSON格式存储)
	 */
	private String recoveryCodes;
	/**
	 * 支付密码
	 */
	private String payPassword;
	/**
	 * 支付密码盐
	 */
	private String paySalt;

}
