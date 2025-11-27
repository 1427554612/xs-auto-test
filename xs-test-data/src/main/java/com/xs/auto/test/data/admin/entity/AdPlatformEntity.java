package com.xs.auto.test.data.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 平台广告表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:40:15
 */
@Data
@TableName("ad_platform")
public class AdPlatformEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 广告位置: 0.游戏详情页--横幅广告1.游戏详情页--推荐栏横幅广告1;2.游戏详情页--推荐栏横幅广告2
	 */
	private Integer adPosition;
	/**
	 * 素材类型：0.图片 1.视频
	 */
	private Integer materialType;
	/**
	 * 广告类型：0.外部链接 1.站内游戏 2.站内页面
	 */
	private Integer adType;
	/**
	 * 链接URL
	 */
	private String linkUrl;
	/**
	 * 素材URL
	 */
	private String materialUrl;
	/**
	 * 展示规则：0.定时展示，1.长期展示
	 */
	private Integer displayRule;
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 状态：0-禁用，1-启用,2-待展示默认状态
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
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 更新人
	 */
	private String updateBy;
	/**
	 * 展示规则
	 */
	private Integer addisplayrules;
	/**
	 * 展示规则0:默认展示，1:加入竞价队列
	 */
	private Integer showType;

}
