package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 游客用户封禁记录表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("tourist_user_member_ban")
public class TouristUserMemberBanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Long touristId;
	/**
	 * 封禁操作时间
	 */
	private Date banTime;
	/**
	 * 封禁时间类型（0：永久 1：3天 2、7天 3：15天 4:30天)
	 */
	private Integer banType;
	/**
	 * 封禁备注
	 */
	private String banRemark;
	/**
	 * 封禁开始时间
	 */
	private Date banStarttime;
	/**
	 * 封禁结束时间
	 */
	private Date banEndtime;
	/**
	 * 状态（0封禁 1解封 2注销账号)
	 */
	private Integer status;
	/**
	 * 操作管理人员
	 */
	private Long createBy;
	/**
	 * 操作管理人员
	 */
	private Long updateBy;
	/**
	 * 操作解禁时间
	 */
	private Date updateAt;

}
