package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户反馈表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("user_feedback")
public class UserFeedbackEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 文件地址，根据英文逗号分割
	 */
	private String fileUrl;
	/**
	 * 用户ID 为空时表示游客
	 */
	private Long userId;
	/**
	 * 游客ID 为空时表示用户
	 */
	private Long touristId;
	/**
	 * 问题类别
	 */
	private String issue;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 返馈邮箱
	 */
	private String email;
	/**
	 * 状态：0, "待处理"；1, "已忽略"；2, "已删除"；3, "已回复"；
	 */
	private Integer status;
	/**
	 * 增加时间
	 */
	private Date createAt;
	/**
	 * 
	 */
	private String orderNumber;
	/**
	 * 反馈的游戏id
	 */
	private Long gameId;
	/**
	 * 建议的游戏名称，和gameId不对应
	 */
	private String gameName;
	/**
	 * 1反馈游戏，2反馈平台，3建议游戏，4商务合作，5退款，6不喜欢
	 */
	private Integer type;
	/**
	 * 操作时间
	 */
	private Date optTime;
	/**
	 * 操作管理员用户ID
	 */
	private Long optAdminUserId;
	/**
	 * 操作管理员用户ID
	 */
	private Long devUserId;
	/**
	 * 退款状态,0：退款中，1：退款成功。空：没退款 2退款失败
	 */
	private Integer refundStatus;
	/**
	 * 退款单号 xsolla为空
	 */
	private String refundNo;
	/**
	 * 退款原因
	 */
	private String refundDescription;
	/**
	 * 退款时间
	 */
	private Date refundCreateTime;
	/**
	 * 退款完成时间
	 */
	private Date refundSuccTime;
	/**
	 * 状态,0：未处理，1：已处理。2拒绝
	 */
	private Integer optStatus;

}
