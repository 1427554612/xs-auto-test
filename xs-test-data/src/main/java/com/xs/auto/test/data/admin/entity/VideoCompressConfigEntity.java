package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 视频压缩配置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("video_compress_config")
public class VideoCompressConfigEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 配置名称
	 */
	private String name;
	/**
	 * 视频宽度
	 */
	private Integer width;
	/**
	 * 视频高度
	 */
	private Integer height;
	/**
	 * 帧率
	 */
	private Integer frameRate;
	/**
	 * 视频码率(kbps)
	 */
	private Integer bitrate;
	/**
	 * 视频编码器
	 */
	private String videoCodec;
	/**
	 * 编码速度设置(ultrafast,superfast,veryfast,faster,fast,medium,slow,slower,veryslow)
	 */
	private String preset;
	/**
	 * 是否移除音频(0-否,1-是)
	 */
	private Integer removeAudio;
	/**
	 * 是否移除元数据(0-否,1-是)
	 */
	private Integer removeMetadata;
	/**
	 * 是否强制覆盖已存在文件(0-否,1-是)
	 */
	private Integer forceOverwrite;
	/**
	 * 状态(0-禁用,1-启用)
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

}
