package com.xs.auto.test.ui_auto_test.entity;// src/main/java/com/example/entity/PoClass.java

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 类管理表
 * </p>
 */
@Data
@EqualsAndHashCode(callSuper = false)
// 开启set方法链式编程
@Accessors(chain = true)
@TableName("po_class")
public class PoClass implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类名
     */
    @TableField("class_name")
    private String className;

    /**
     * 说明
     */
    @TableField("des")
    private String des;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 最后修改时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 修改版本
     */
    @TableField("version")
    @Version
    private Integer version;

    /**
     * 修改人
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 具体代码
     */
    @TableField("code")
    private String code;
}