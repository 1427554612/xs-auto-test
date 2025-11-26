/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.0.175_3306
 Source Server Type    : MySQL
 Source Server Version : 50744
 Source Host           : 192.168.0.175:3306
 Source Schema         : auto-test

 Target Server Type    : MySQL
 Target Server Version : 50744
 File Encoding         : 65001

 Date: 26/11/2025 17:52:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_case_run
-- ----------------------------
DROP TABLE IF EXISTS `test_case_run`;
CREATE TABLE `test_case_run`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `case_id` int(11) NULL DEFAULT NULL COMMENT 'test_casse id',
  `class_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类名',
  `method_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '方法名称',
  `last_run_result` int(11) NULL DEFAULT NULL COMMENT '最近一次执行结果：0 失败, 1 成功',
  `last_run_config_id` int(11) NULL DEFAULT NULL COMMENT '最近一次执行采用的配置',
  `last_run_start_time` datetime(0) NULL DEFAULT NULL COMMENT '最近一次执行时间',
  `run_count` int(11) NULL DEFAULT NULL COMMENT '累计执行次数',
  `success_count` int(11) NULL DEFAULT NULL COMMENT '成功执行总数',
  `error_count` int(11) NULL DEFAULT NULL COMMENT '失败执行总数',
  `run_time_count` int(11) NULL DEFAULT NULL COMMENT '执行累计耗时',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_case_id`(`case_id`) USING BTREE,
  INDEX `idx_last_run_time`(`last_run_start_time`) USING BTREE,
  INDEX `idx_class_method`(`class_name`, `method_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '测试用例运行记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test_case_run
-- ----------------------------
INSERT INTO `test_case_run` VALUES (1, 2, 'UserTestCase', 'testLogin', 1, 2, '2025-11-26 17:43:29', 8, 8, 0, 34);
INSERT INTO `test_case_run` VALUES (2, 2, 'UserTestCase', 'testLoginError', 0, 1, '2025-11-26 11:44:43', 3, 0, 3, 90);
INSERT INTO `test_case_run` VALUES (3, 2, 'UserTestCase', 'testShow', 0, 2, '2025-11-26 17:43:43', 8, 0, 8, 16);

SET FOREIGN_KEY_CHECKS = 1;
