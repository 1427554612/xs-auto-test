package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 好友热度分数表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("friend_heat_score")
public class FriendHeatScoreEntity implements Serializable {
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
	 * 好友ID
	 */
	private Long friendId;
	/**
	 * 成为好友天数分数
	 */
	private Integer friendDaysScore;
	/**
	 * 聊天次数分数
	 */
	private Integer chatScore;
	/**
	 * 连续聊天分数
	 */
	private Integer consecutiveChatScore;
	/**
	 * 共同游戏分数
	 */
	private Integer commonGameScore;
	/**
	 * 最后聊天日期
	 */
	private Date lastChatDate;
	/**
	 * 连续聊天天数
	 */
	private Integer consecutiveDays;
	/**
	 * 总分数
	 */
	private Integer totalScore;
	/**
	 * 最后计算日期
	 */
	private Date lastCalculateDate;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
