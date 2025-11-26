package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 空投记录
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("calorcoin_invest")
public class CalorcoinInvestEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 空投类型ID
	 */
	private Long thoroughfareId;
	/**
	 * 流通类型明细ID
	 */
	private Long calorcoinTypeId;
	/**
	 * 1：平台官方2：玩家3：开发者
	 */
	private Integer paySource;
	/**
	 * 1：平台官方2：玩家3：开发者
	 */
	private Integer payTarget;
	/**
	 * 用户类弄1玩家2开发者
	 */
	private Integer userType;
	/**
	 * 空投数量
	 */
	private BigDecimal investNum;
	/**
	 * 空投的用户ID
	 */
	private Long userId;
	/**
	 * 状态1 成功，0失败
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 更新人
	 */
	private String updateBy;
	/**
	 * 失败原因
	 */
	private String errorMsg;
	/**
	 * 空投的用户邮箱
	 */
	private String accountEmail;

}
