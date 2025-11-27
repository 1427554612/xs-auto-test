package com.xs.auto.test.ui_auto_test.core;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.WaitUntilState;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class TestRunHandle {
    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;
    private Page page;

    public Page initPage(String baseUrl){
        List<String> broseArgs = new ArrayList<>();
        broseArgs.add("--start-maximized");
        broseArgs.add("--window-size=1920,1080"); // 设置具体尺寸
        broseArgs.add("--disable-features=VizDisplayCompositor");
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(broseArgs));
        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        page = context.newPage();
        page.navigate(baseUrl, new Page.NavigateOptions().setWaitUntil(WaitUntilState.DOMCONTENTLOADED));
        return page;
    }

    /**
     * 关闭资源
     */
    public void close() throws InterruptedException {
        Thread.sleep(1000);
        page.close();
        context.close();
        browser.close();
        playwright.close();
    }

}
