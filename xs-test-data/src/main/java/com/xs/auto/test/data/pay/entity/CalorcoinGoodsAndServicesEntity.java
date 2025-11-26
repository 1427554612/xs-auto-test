package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品/服务
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("calorcoin_goods_and_services")
public class CalorcoinGoodsAndServicesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 应用场景 0：开发者推广资源 1：平台服务 2：开发者充值
	 */
	private Integer applicationScenarios;
	/**
	 * 广告位 0：游戏内激励视频广告 1：游戏内中场插屏广告 2：网站横幅广告 3：游戏内横幅广告 4：游戏内中场插屏视频广告
	 */
	private Integer adType;
	/**
	 * 计费规则0：CPC 1：CPM
	 */
	private Integer billingRules;
	/**
	 * CPC价格
	 */
	private BigDecimal cpcPrice;
	/**
	 * 商品图片
	 */
	private String productImage;
	/**
	 * 商品/服务数量
	 */
	private Integer productNum;
	/**
	 * 销售日期
	 */
	private Date salesDate;
	/**
	 * 销售国家/地区
	 */
	private String salesLocation;
	/**
	 * 状态1 正常，0禁用
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
	 * 是否删除，1删除，0未删除
	 */
	private Integer deleteFlag;
	/**
	 * 排序
	 */
	private Integer sort;

}
