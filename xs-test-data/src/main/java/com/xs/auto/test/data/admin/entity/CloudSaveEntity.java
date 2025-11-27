package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 云存档表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("cloud_save")
public class CloudSaveEntity implements Serializable {
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
	 * 游戏ID
	 */
	private Long gameId;
	/**
	 * 存档文件名
	 */
	private String fileName;
	/**
	 * 存档文件路径（RustFS中的路径）
	 */
	private String filePath;
	/**
	 * 文件大小（字节）
	 */
	private Long fileSize;
	/**
	 * 文件大小（MB，保留2位小数）
	 */
	private BigDecimal fileSizeMb;
	/**
	 * 存档类型（1：自动存档，2：手动存档）
	 */
	private Integer saveType;
	/**
	 * 存档状态（0：正常，1：已删除）
	 */
	private Integer status;
	/**
	 * 国家代码（用于域名分配）
	 */
	private String countryCode;
	/**
	 * 分配的域名
	 */
	private String domain;
	/**
	 * 预签名URL（用于前端访问）
	 */
	private String presignedUrl;
	/**
	 * 预签名URL过期时间
	 */
	private Date presignedUrlExpireTime;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
