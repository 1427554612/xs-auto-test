package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 中奖发放奖品数配置
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("activity_prize")
public class ActivityPrizeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 奖品ID
	 */
	@TableId
	private Long id;
	/**
	 * 奖品类型  1-实物奖品，2-虚拟奖品CDKey，3-虚拟奖品兑换码，4-虚拟奖品热力币,5- 道具
	 */
	private Integer prizeType;
	/**
	 * 热力币数
	 */
	private BigDecimal calorcoinNum;
	/**
	 * 派发方式 1、领取派发 2、自动派发
	 */
	private Integer distributionMethod;
	/**
	 * 奖品库ID（关联奖品库表）
	 */
	private Long prizeLibraryId;
	/**
	 * 操作 1、选用 2、已选用
	 */
	private Integer operation;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 创建人ID
	 */
	private Long creatorId;
	/**
	 * 创建人姓名
	 */
	private String creatorName;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 状态：0-未领用，1-已领用
	 */
	private Integer status;

}
