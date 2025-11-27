package com.xs.auto.test.ui_auto_test.testcase;

import com.xs.auto.test.ui_auto_test.po.HomePage;
import com.xs.auto.test.ui_auto_test.po.UserPage;
import com.xs.auto.test.ui_auto_test.entity.TestCaseRunInfo;
import java.time.Duration;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


@Component
public class UserTestCase extends BaseTestCase {

    public HomePage homePage;
    public UserPage userPage;

    public UserTestCase(){
        super();
    }

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
    }

    public void setUserPage(UserPage userPage) {
        this.userPage = userPage;
    }

    /**
     * 测试正常登录
     */
    public void testLogin(){
        super.init(UserTestCase.class);
        websocketLogFactory.info("testHome用例开始执行......");
        LocalDateTime now = LocalDateTime.now();
        TestCaseRunInfo testCaseRunInfo = new TestCaseRunInfo().setConfigId(testCaseConfig.getId()).setStartTime(LocalDateTime.now())
                .setClassName(new Object(){}.getClass().getEnclosingClass().getSimpleName())
                .setMethodName(new Object(){}.getClass().getEnclosingMethod().getName())
                .setCaseId(super.testCase.getId()).setUpdateBy("zhangjun");
        try {
            websocketLogFactory.info("selectGamePage 执行通过......");
            homePage.gotoHome();
            websocketLogFactory.info("gotoHome 执行通过......");
            userPage.login("zhangjun@qq.com","123456");
            websocketLogFactory.info("login 执行通过......");
            testCaseRunInfo.setEndTime(LocalDateTime.now()).setRunTime(Duration.between(now,LocalDateTime.now()).getSeconds()).setRunResult(1);
        }
        catch (Exception | AssertionError error){
            websocketLogFactory.error("testHome执行失败....，错误信息:" + error.getMessage());
            testCaseRunInfo.setEndTime(LocalDateTime.now())
                    .setRunTime(Duration.between(now,LocalDateTime.now()).getSeconds())
                    .setRunResult(0).setErrorMsg(error.getMessage());
        }finally{
            testCaseRunInfo.setImgInfo(super.resultUpload(testCaseRunInfo.getMethodName()));
            websocketLogFactory.info("testLogin 结果插入成功！！！");
            testCaseRunInfo.setRunLog(websocketLogFactory.info("testLogin 用例执行完毕......"));
            super.testCaseRunInfoMapper.insert(testCaseRunInfo);
        }
    }

    /**
     * 测试异常登录
     */
    public void testLoginError(){
        super.init(UserTestCase.class);
        websocketLogFactory.info("testLoginError用例开始执行......");
        LocalDateTime now = LocalDateTime.now();
        TestCaseRunInfo testCaseRunInfo = new TestCaseRunInfo().setStartTime(LocalDateTime.now())
                .setClassName(new Object(){}.getClass().getEnclosingClass().getSimpleName())
                .setMethodName(new Object(){}.getClass().getEnclosingMethod().getName())
                .setCaseId(super.testCase.getId()).setUpdateBy("zhangjun");
        try {
            websocketLogFactory.info("selectGamePage 执行通过......");
            userPage.login("zhangjun@qq.com","654321");
            assertThat(page.locator("#JogosLogin > div.jogos-login-dialog.absolute > div > div.page-main.mt-30px > div:nth-child(2) > p")).hasText("Login Failed: Incorrect Account or Password");
            websocketLogFactory.info("testLoginError 执行通过......");
            testCaseRunInfo.setEndTime(LocalDateTime.now()).setRunTime(Duration.between(now,LocalDateTime.now()).getSeconds()).setRunResult(1);
        }
        catch (Exception | AssertionError error){
            websocketLogFactory.error("testLoginError 执行失败....，错误信息:" + error.getMessage());
            testCaseRunInfo.setEndTime(LocalDateTime.now())
                    .setRunTime(Duration.between(now,LocalDateTime.now()).getSeconds())
                    .setRunResult(0).setErrorMsg(error.getMessage());
        }
        finally{
            testCaseRunInfo.setImgInfo(super.resultUpload(testCaseRunInfo.getMethodName()));
            websocketLogFactory.info("testLoginError 结果插入成功！！！");
            testCaseRunInfo.setRunLog(websocketLogFactory.info("testLoginError 用例执行完毕......"));
            super.testCaseRunInfoMapper.insert(testCaseRunInfo);
        }
    }
    /**
     * 测试方法
     */
    public void testShow(){
        super.init(UserTestCase.class);
        websocketLogFactory.info("testShow用例开始执行......");
        LocalDateTime now = LocalDateTime.now();
        TestCaseRunInfo testCaseRunInfo = new TestCaseRunInfo().setStartTime(LocalDateTime.now())
                .setClassName(new Object(){}.getClass().getEnclosingClass().getSimpleName())
                .setMethodName(new Object(){}.getClass().getEnclosingMethod().getName())
                .setCaseId(super.testCase.getId()).setUpdateBy("zhangjun");
        try {
            homePage.selectGamePage();
            websocketLogFactory.info("selectGamePage 执行通过......");
            int a = 10;
            int b = 0;
            int c = a/b;
            testCaseRunInfo.setEndTime(LocalDateTime.now()).setRunTime(Duration.between(now,LocalDateTime.now()).getSeconds()).setRunResult(1);
        }catch (Exception | AssertionError error){
            websocketLogFactory.error("testShow执行失败....，错误信息:" + error.getMessage());
            testCaseRunInfo.setEndTime(LocalDateTime.now())
                    .setRunTime(Duration.between(now,LocalDateTime.now()).getSeconds())
                    .setRunResult(0).setErrorMsg(error.getMessage());
        }
        finally{
            testCaseRunInfo.setImgInfo(super.resultUpload(testCaseRunInfo.getMethodName()));
            websocketLogFactory.info("testShow 结果插入成功！！！");
            testCaseRunInfo.setRunLog(websocketLogFactory.info("testShow 用例执行完毕......"));
            super.testCaseRunInfoMapper.insert(testCaseRunInfo);
        }
    }
}