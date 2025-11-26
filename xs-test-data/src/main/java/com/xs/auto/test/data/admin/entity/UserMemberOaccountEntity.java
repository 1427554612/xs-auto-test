package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户第三方账号表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_member_oaccount")
public class UserMemberOaccountEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 第三方google facebook
	 */
	private String accountChannel;
	/**
	 * 账号状态0正常 1删除
	 */
	private Integer accountStatus;
	/**
	 * 账号名称
	 */
	private String accountName;
	/**
	 * 账号头像
	 */
	private String picture;
	/**
	 * given_name
	 */
	private String givenName;
	/**
	 * family_name
	 */
	private String familyName;
	/**
	 * 生日
	 */
	private String userBirthday;
	/**
	 * 喜好
	 */
	private String userLikes;
	/**
	 * 头像
	 */
	private String userPhotos;
	/**
	 * 好友
	 */
	private String userFriends;
	/**
	 * 状态
	 */
	private String userStatus;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 其它属性
	 */
	private String publicProfile;
	/**
	 * 第三方平台用户ID（如Facebook ID、Google ID等）
	 */
	private String thirdPartyId;

}
