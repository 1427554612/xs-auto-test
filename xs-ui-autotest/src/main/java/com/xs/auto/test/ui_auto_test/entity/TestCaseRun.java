package com.xs.auto.test.ui_auto_test.entity;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 测试用例运行记录表
 * </p>
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("test_case_run")
public class TestCaseRun implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * test_case id
     */
    @TableField("case_id")
    private Integer caseId;

    /**
     * 类名
     */
    @TableField("class_name")
    private String className;

    /**
     * 方法名称
     */
    @TableField("method_name")
    private String methodName;

    /**
     * 最近一次执行结果：0 失败, 1 成功
     */
    @TableField("last_run_result")
    private Integer lastRunResult;

    /**
     * 最近一次执行采用的配置
     */
    @TableField("last_run_config_id")
    private Integer lastRunConfigId;

    /**
     * 最近一次执行时间
     */
    @TableField("last_run_start_time")
    private LocalDateTime lastRunStartTime;

    /**
     * 累计执行次数
     */
    @TableField("run_count")
    private Integer runCount;

    /**
     * 成功执行总数
     */
    @TableField("success_count")
    private Integer successCount;

    /**
     * 失败执行总数
     */
    @TableField("error_count")
    private Integer errorCount;

    /**
     * 执行累计耗时
     */
    @TableField("run_time_count")
    private Integer runTimeCount;

    /**
     * 临时查的列，这个字段不在数据库中
     */
    @TableField(exist = false)
    private String configName;
}
