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

 Date: 26/11/2025 17:52:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_case_config
-- ----------------------------
DROP TABLE IF EXISTS `test_case_config`;
CREATE TABLE `test_case_config`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `config_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '测试名称',
  `config_context` json NULL COMMENT '测试配置',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  `status` int(11) NULL DEFAULT NULL COMMENT '0:禁用  1:启用',
  `update_by` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test_case_config
-- ----------------------------
INSERT INTO `test_case_config` VALUES (1, 'pre主网', '{\"url\": \"http://jogospre.com\"}', '2025-11-18 17:04:54', '2025-11-18 18:01:44', 1, NULL);
INSERT INTO `test_case_config` VALUES (2, 'dev主网', '{\"url\": \"https://www.jogosdev.com/\"}', '2025-11-18 16:16:13', '2025-11-19 09:33:09', 1, NULL);

SET FOREIGN_KEY_CHECKS = 1;
