package com.xs.auto.test.ui_auto_test.po;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class UserPage {

    public Page page;

    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 注册
     * @return
     */
    public void register(){
        // 注册
        page.click("//*[@id=\"app\"]/div[1]/header/section[2]/section[2]/div[1]/div/span[2]");
        // 输入账号密码
        page.locator("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/input").fill("zhangjun"+System.currentTimeMillis()+"@163.com");
        page.click("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[3]");
        page.locator("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[2]/input").fill("Zj123456");
        page.locator("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[1]/div/div[3]/div[2]/input").fill("Zj123456");
        page.click("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[2]/span[1]");
        page.click("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[3]");
        Locator UserNameInput = page.locator(".el-input__inner").nth(0);
        UserNameInput.inputValue().contains("Player");
        page.locator(".userInfo-header-close").nth(0).click();
    }

    /**
     * 登录操作
     * @param username
     * @param password
     * @return
     */
    public void login(String username,String password){
        page.click("//*[@id=\"app\"]/div[1]/header/section[2]/section[2]/div[1]/div/span[2]");
        // 输入账号密码
        Locator loginInput = page.locator("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/input");
        loginInput.fill(username);
        page.click("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[3]");
        Locator passwordInput = page.locator("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[2]/div[2]/input[2]");
        passwordInput.fill(password);
        page.click("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[3]");
    }

    /**
     * 退出登录
     * @return
     */
    public void logout(){
        page.click("//*[@id=\"app\"]/div[1]/header/section[2]/section[1]/section[2]/section[2]/img");
        // 基于公共组件的查找操作
        page.evaluate("()=>{" +
                "document.querySelector('.el-drawer__body').children[0].children[0].children[4].children[0].children[8].click()" +
                "}");
        assertThat(page.locator("//*[@id=\"app\"]/div[1]/header/section[2]/section[2]/div[1]/div/span[2]")).hasText("Log in");
    }

}
