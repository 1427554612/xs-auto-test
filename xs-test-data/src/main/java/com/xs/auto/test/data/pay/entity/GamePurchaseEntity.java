package com.xs.auto.test.data.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品价格设置表
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2025-09-19 15:53:55
 */
@Data
@TableName("game_purchase")
public class GamePurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 游戏ID
	 */
	private Long gameId;
	/**
	 * skuid
	 */
	private String sku;
	/**
	 * 商品类型1:买断 2商品,3-道具
	 */
	private Integer purchaseType;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 图片
	 */
	private String imageUrl;
	/**
	 * 库存
	 */
	private Integer inventory;
	/**
	 * 开始日期
	 */
	private Date startTime;
	/**
	 * 结束日期
	 */
	private Date endTime;
	/**
	 * 币种
	 */
	private String currency;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 创建时间
	 */
	private Date createdAt;
	/**
	 * 更新时间
	 */
	private Date updatedAt;
	/**
	 * 排序序号（数值越小排序越靠前）
	 */
	private Integer sortOrder;
	/**
	 * 国家列表，逗号分隔的字符串格式，如"China Mainland,Hong Kong,Taiwan"
	 */
	private String countryList;
	/**
	 * 状态 1：正常 2：禁用 3删除,4:草稿
	 */
	private Integer status;
	/**
	 * 每个用户仅能购买一次
	 */
	private Integer isUnique;
	/**
	 * 游戏商品id
	 */
	private String productId;
	/**
	 * 折扣sku
	 */
	private String coSku;
	/**
	 * 道具id,type为3的时候必不为空
	 */
	private Long itemId;

}
