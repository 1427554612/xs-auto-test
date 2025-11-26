package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * API请求日志表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("api_request_log")
public class ApiRequestLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Long id;
	/**
	 * 请求URI
	 */
	private String requestUri;
	/**
	 * 请求方法
	 */
	private String requestMethod;
	/**
	 * 请求参数(URL参数)
	 */
	private String requestParams;
	/**
	 * 请求体(Body参数)
	 */
	private String requestBody;
	/**
	 * 执行时间(毫秒)
	 */
	private Long executionTime;
	/**
	 * 请求IP地址
	 */
	private String ipAddress;
	/**
	 * 用户代理
	 */
	private String userAgent;
	/**
	 * 请求状态(1-成功, 0-失败)
	 */
	private Integer status;
	/**
	 * 错误信息
	 */
	private String errorMessage;
	/**
	 * 响应编码
	 */
	private String responseCode;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
