package com.xs.auto.test.ui_auto_test.vo;

import lombok.Data;

@Data
public class RunCaseVo {
    String id;         // 用例id
    String methods[];  // 执行方法列表
    Integer configId;  // 配置id
    String name;       // 当前链接用户，用于判断websocket用户
}
