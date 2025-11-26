package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 广告报告生成日志表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_report_log")
public class AdReportLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 报告日期
	 */
	private Date reportDate;
	/**
	 * 广告供应商ID
	 */
	private Long vendorId;
	/**
	 * 广告供应商名称
	 */
	private String vendorName;
	/**
	 * 状态：0-处理中，1-成功，2-失败
	 */
	private Integer status;
	/**
	 * 错误信息
	 */
	private String errorMessage;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
