package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 广告单元表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_unit")
public class AdUnitEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 用户id/开发者id
	 */
	private Long userId;
	/**
	 * 游戏id
	 */
	private Long gameId;
	/**
	 * 广告位id
	 */
	private Long positionId;
	/**
	 * 广告类型
	 */
	private Integer adType;
	/**
	 * 广告服务商ID
	 */
	private Long vendorId;
	/**
	 * 素材类型：0.image-图片，1.视频
	 */
	private Integer materialType;
	/**
	 * 宽度(px)
	 */
	private Integer width;
	/**
	 * 高度(px)
	 */
	private Integer height;
	/**
	 * 广告单元名称
	 */
	private String unitName;
	/**
	 * 广告内容/code
	 */
	private String unitCode;
	/**
	 * 广告id
	 */
	private String unitId;

}
