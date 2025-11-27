package com.xs.auto.test.ui_auto_test.po;


public class RunUiTest {

    private HomePage homePage;
    private UserPage userPage;

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
    }

    public void setUserPage(UserPage userPage) {
        this.userPage = userPage;
    }

    public boolean testLogin(){
        homePage.selectGamePage();
        userPage.login("zhangjun@qq.com","123456");
        return true;
    }
}
