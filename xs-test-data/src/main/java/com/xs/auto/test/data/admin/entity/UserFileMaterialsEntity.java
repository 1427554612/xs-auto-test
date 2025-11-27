package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 文件素材表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-17 16:59:47
 */
@Data
@TableName("user_file_materials")
public class UserFileMaterialsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String fileId;
	/**
	 * 标签名称
	 */
	private String labelName;
	/**
	 * 文件名
	 */
	private String fileName;
	/**
	 * 文件类型(0 图片 1 视频)
	 */
	private Integer fileType;
	/**
	 * 文件访问url
	 */
	private String fileUrl;
	/**
	 * 文件大小 /kb
	 */
	private Long fileSize;
	/**
	 * 文件在磁盘地址
	 */
	private String filePath;
	/**
	 * 上传者id
	 */
	private String uploadUserId;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 上传时间
	 */
	private Date uploadTime;
	/**
	 * 状态 0:无效 1:有效
	 */
	private Integer status;
	/**
	 * 说明
	 */
	private String description;

}
