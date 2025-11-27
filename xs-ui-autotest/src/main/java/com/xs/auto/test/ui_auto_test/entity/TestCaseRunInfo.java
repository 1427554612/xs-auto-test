package com.xs.auto.test.ui_auto_test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "test_case_run_info",autoResultMap =true)
public class TestCaseRunInfo implements Serializable {

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
     * 配置id
     */
    @TableField("config_id")
    private Integer configId;

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
     * 开始时间
     */
    @TableField("start_time")
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    @TableField("end_time")
    private LocalDateTime endTime;

    /**
     * 执行时间
     */
    @TableField("run_time")
    private Long runTime;

    /**
     * 执行结果：0 失败, 1 成功
     */
    @TableField("run_result")
    private Integer runResult;

    /**
     * 错误截图位置
     */
    @TableField(value = "img_info",typeHandler = FastjsonTypeHandler.class)
    private Map<String,Object> imgInfo;

    /**
     * 错误日志
     */
    @TableField("error_msg")
    private String errorMsg;

    /**
     * 修改人
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 运行日志
     */
    @TableField("run_log")
    private String runLog;


}
