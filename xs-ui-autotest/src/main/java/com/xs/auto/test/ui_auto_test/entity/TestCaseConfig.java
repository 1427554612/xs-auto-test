package com.xs.auto.test.ui_auto_test.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "test_case_config", autoResultMap = true)
public class TestCaseConfig {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("config_name")
    private String configName;

    @TableField(value = "config_context", typeHandler = JacksonTypeHandler.class)
    private Map<String, Object> configContext;

    @TableField("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @TableField("update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    @TableField("status")
    private Integer status;

    @TableField("update_by")
    private String updateBy;


}