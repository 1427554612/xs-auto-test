package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 开发者基础统计表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("developer_user_basestat")
public class DeveloperUserBasestatEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 开发者ID
	 */
	private Long developerId;
	/**
	 * 游戏数
	 */
	private Integer gameTotal;
	/**
	 * 游戏反馈次数
	 */
	private Integer feedbackTotal;
	/**
	 * 解答反馈次数
	 */
	private Integer replyTotal;

}
