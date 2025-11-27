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

 Date: 26/11/2025 17:52:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for po_class
-- ----------------------------
DROP TABLE IF EXISTS `po_class`;
CREATE TABLE `po_class`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `class_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类名',
  `des` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '说明',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '最后修改时间',
  `version` int(11) NULL DEFAULT NULL COMMENT '修改版本',
  `update_by` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `code` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '具体代码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of po_class
-- ----------------------------
INSERT INTO `po_class` VALUES (1, 'HomePage', '游戏页面', '2025-10-30 16:35:52', '2025-10-30 16:35:55', 1, '张军', 'import com.microsoft.playwright.BrowserContext;\r\nimport com.microsoft.playwright.Locator;\r\nimport com.microsoft.playwright.Page;\r\nimport com.microsoft.playwright.options.LoadState;\r\nimport com.microsoft.playwright.options.WaitUntilState;\r\n\r\nimport static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;\r\n\r\n\r\npublic class HomePage {\r\n\r\n    private Page page;\r\n\r\n    public void setPage(Page page) {\r\n        this.page = page;\r\n    }\r\n\r\n    /**\r\n     * 进入主页，判断滚动条\r\n     * @return\r\n     */\r\n    public void forHome(){\r\n        page.navigate(\"https://www.jogosdev.com/\", new Page.NavigateOptions().setWaitUntil(WaitUntilState.DOMCONTENTLOADED));\r\n        // 判断页面标题是否是Jogos\r\n        assertThat(page).hasTitle(\"Jogos\");\r\n    }\r\n\r\n    /**\r\n     * 通过滚动条\r\n     * @return\r\n     */\r\n    public void scrollBar(){\r\n        this.page.locator(\"div.year-13-scroll\").evaluate(\"element => element.scrollTo(0, element.scrollHeight)\");\r\n        this.page.locator(\"//*[@id=\\\"app\\\"]/div[3]/div/div[3]/div\").click();\r\n    }\r\n\r\n    /**\r\n     * 切换回主页\r\n     * @return\r\n     */\r\n    public void gotoHome(){\r\n        Locator logo = this.page.locator(\".logo > :first-child\");\r\n        logo.click();\r\n    }\r\n\r\n    /**\r\n     * 切换聚合页\r\n     * @return\r\n     */\r\n    public void selectGamePage() {\r\n        Locator selector = page.locator(\"//*[@id=\\\"app\\\"]/div[2]/div/div[1]/div/section/section/section/section[1]\");\r\n        Locator childrenSelector = selector.locator(\"> *\");\r\n        assertThat(childrenSelector).hasCount(5);\r\n        // 避免太快\r\n        for (int i = 1; i < childrenSelector.count(); i++) {\r\n            Locator nth = childrenSelector.nth(i);\r\n            try {\r\n                Thread.sleep(500);\r\n            }catch (Exception e){\r\n\r\n            }\r\n            nth.click();\r\n            // 重定向到新地址\r\n            BrowserContext context1 = page.context();\r\n            Page newPage = context1.pages().get(context1.pages().size() - 1);\r\n            newPage.bringToFront(); // 重要：确保新页面在前台\r\n            newPage.waitForLoadState(LoadState.DOMCONTENTLOADED);\r\n            //assertThat(newPage.locator(\".CollectionContent-tit.flex.flex_item_mid.justify-between > :first-child > :nth-child(2)\")).hasText(nth.textContent());\r\n     }\r\n    }\r\n}');
INSERT INTO `po_class` VALUES (2, 'UserPage', '登录页面', '2025-10-30 16:35:52', '2025-10-30 16:35:55', 1, '张军', 'import com.microsoft.playwright.Locator;\r\nimport com.microsoft.playwright.Page;\r\nimport static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;\r\n\r\npublic class UserPage {\r\n\r\n    public Page page;\r\n\r\n    public void setPage(Page page) {\r\n        this.page = page;\r\n    }\r\n\r\n    /**\r\n     * 注册\r\n     * @return\r\n     */\r\n    public void register(){\r\n        // 注册\r\n        page.click(\"//*[@id=\\\"app\\\"]/div[1]/header/section[2]/section[2]/div[1]/div/span[2]\");\r\n        // 输入账号密码\r\n        page.locator(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/input\").fill(\"zhangjun\"+System.currentTimeMillis()+\"@163.com\");\r\n        page.click(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/div[3]\");\r\n        page.locator(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[2]/input\").fill(\"Zj123456\");\r\n        page.locator(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/div[1]/div/div[3]/div[2]/input\").fill(\"Zj123456\");\r\n        page.click(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/div[2]/span[1]\");\r\n        page.click(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/div[3]\");\r\n        Locator UserNameInput = page.locator(\".el-input__inner\").nth(0);\r\n        UserNameInput.inputValue().contains(\"Player\");\r\n        page.locator(\".userInfo-header-close\").nth(0).click();\r\n    }\r\n\r\n    /**\r\n     * 登录操作\r\n     * @param username\r\n     * @param password\r\n     * @return\r\n     */\r\n    public void login(String username,String password){\r\n        page.click(\"//*[@id=\\\"app\\\"]/div[1]/header/section[2]/section[2]/div[1]/div/span[2]\");\r\n        // 输入账号密码\r\n        Locator loginInput = page.locator(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/input\");\r\n        loginInput.fill(username);\r\n        page.click(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/div[3]\");\r\n        Locator passwordInput = page.locator(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/div[2]/div[2]/input[2]\");\r\n        passwordInput.fill(password);\r\n        page.click(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/div[3]\");\r\n    }\r\n\r\n    /**\r\n     * 退出登录\r\n     * @return\r\n     */\r\n    public void logout(){\r\n        page.click(\"//*[@id=\\\"app\\\"]/div[1]/header/section[2]/section[1]/section[2]/section[2]/img\");\r\n        // 基于公共组件的查找操作\r\n        page.evaluate(\"()=>{\" +\r\n                \"document.querySelector(\'.el-drawer__body\').children[0].children[0].children[4].children[0].children[8].click()\" +\r\n                \"}\");\r\n        assertThat(page.locator(\"//*[@id=\\\"app\\\"]/div[1]/header/section[2]/section[2]/div[1]/div/span[2]\")).hasText(\"Log in\");\r\n    }\r\n\r\n}');

SET FOREIGN_KEY_CHECKS = 1;
