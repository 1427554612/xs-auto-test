package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 操作日志
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("sys_log_operate")
public class SysLogOperateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 请求id
	 */
	private String reqId;
	/**
	 * 模块名
	 */
	private String module;
	/**
	 * 操作名
	 */
	private String name;
	/**
	 * 请求URI
	 */
	private String reqUri;
	/**
	 * 请求方法
	 */
	private String reqMethod;
	/**
	 * 请求参数
	 */
	private String reqParams;
	/**
	 * 操作IP
	 */
	private String ip;
	/**
	 * 登录地点
	 */
	private String address;
	/**
	 * User Agent
	 */
	private String userAgent;
	/**
	 * 操作类型
	 */
	private Integer operateType;
	/**
	 * 执行时长
	 */
	private Integer duration;
	/**
	 * 操作状态  0：失败   1：成功
	 */
	private Integer status;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 操作人
	 */
	private String realName;
	/**
	 * 返回消息
	 */
	private String resultMsg;
	/**
	 * 创建时间
	 */
	private Long createTime;
	/**
	 * 异常信息
	 */
	private String exceptionMsg;

}
