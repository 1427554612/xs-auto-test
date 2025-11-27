package com.xs.auto.test.ui_auto_test.entity;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;


@TableName("test_case")
@Data
@ToString
public class TestCase {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("class_name")
    private String className;

    @TableField("des")
    private String des;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("version")
    private Integer version;

    @TableField("is_main")
    private Integer isMain;

    @TableField("update_by")
    private String updateBy;

    @TableField("code")
    private String code;

    @TableField("case_type")
    private Integer caseType;

}
