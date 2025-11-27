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
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("developer_details")
public class DeveloperDetailsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增主键
	 */
	@TableId
	private Integer id;
	/**
	 * 开发者ID
	 */
	private Long developerId;
	/**
	 * 0:个人，1公司主体
	 */
	private Integer type;
	/**
	 * 联系人邮箱
	 */
	private String contectEmail;
	/**
	 * 联系人手机号
	 */
	private String phoneNumber;
	/**
	 * 
	 */
	private String countryCode;
	/**
	 * 开发者名字last
	 */
	private String lastName;
	/**
	 * 开发者名字middle
	 */
	private String middleName;
	/**
	 * 姓名
	 */
	private String developerName;
	/**
	 * 开发者名字first
	 */
	private String firstName;
	/**
	 * 公司地址
	 */
	private String company;
	/**
	 * 街道
	 */
	private String streetAddress;
	/**
	 * 
	 */
	private String city;
	/**
	 * 
	 */
	private String country;
	/**
	 * 
	 */
	private String zipCode;
	/**
	 * 创建时间

	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;

}
