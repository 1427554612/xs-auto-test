package com.xs.auto.test.ui_auto_test.script;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;
import com.xs.auto.test.ui_auto_test.po.HomePage;
import com.xs.auto.test.ui_auto_test.po.UserPage;
import com.xs.auto.test.ui_auto_test.utils.ScreensUtil;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlaywrightService {
    static Playwright playwright;
    static Browser browser;
    static BrowserContext context;
    static Page page;
    static ScreensUtil screensUtil;

    /**
       playwright对象
        Playwright playwright = Playwright.create();
     * browser对象
     * context对象
     * page对象
     * @throws InterruptedException
     */

    public static void setUp(){
        List<String> broseArgs = new ArrayList<>();
        broseArgs.add("--start-maximized");
        broseArgs.add("--window-size=1920,1080"); // 设置具体尺寸
        broseArgs.add("--disable-features=VizDisplayCompositor");
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(broseArgs));
        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        page = context.newPage();
        // context级别，设置默认操作超时时间
        context.setDefaultTimeout(10000);
        // page级别，设置默认操作时间
        page.setDefaultTimeout(10000);
        screensUtil = new ScreensUtil(page);
        System.out.println("页面标题: " + page.title());
        System.out.println("页面URL: " + page.url());
    }




    /**
     * 注册
     * @return
     */
    public static boolean register(){
        try {
            // 注册
            page.click("//*[@id=\"app\"]/div[1]/header/section[2]/section[2]/div[1]/div/span[2]");

            // 输入账号密码
            page.locator("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/input").fill("zhangjun"+System.currentTimeMillis()+"@163.com");
            page.click("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[3]");
            page.locator("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[2]/input").fill("Zj123456");
            page.locator("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[1]/div/div[3]/div[2]/input").fill("Zj123456");
            page.click("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[2]/span[1]");
            page.click("//*[@id=\"JogosLogin\"]/div[2]/div/div[3]/div[3]");
            // .开头为className定位
            Locator UserNameInput = page.locator(".el-input__inner").nth(0);
            if (!UserNameInput.inputValue().contains("Player")){
                return false;
            }
            page.locator(".userInfo-header-close").nth(0).click();
        }catch (Exception | Error error){
            screensUtil.screen(Thread.currentThread().getStackTrace()[1].getMethodName(),"image.png");
            return false;
        }
        return true;
    }



    public static void main(String[] args) throws InterruptedException {
        setUp();
        HomePage homePage = new HomePage();
        UserPage userPage = new UserPage();
        homePage.setPage(page);
        userPage.setPage(page);
        homePage.forHome("https://www.baidu.com");
        homePage.selectGamePage();
        homePage.gotoHome();
        register();
        userPage.logout();
        userPage.login("zhangjun@qq.com","123456");


        // 选择聚合页游戏
        Locator gameIcon = page.locator("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div[2]/div[4]/div/a[1]/div[2]/img");
        gameIcon.click();
        // 获取新页面
        BrowserContext context1 = page.context();
        List<Page> pages = context1.pages();
        Page newPage = pages.get(pages.size() - 1);

        // 重定向到新地址
        newPage.bringToFront(); // 重要：确保新页面在前台
        page = newPage;

        page.waitForLoadState(LoadState.DOMCONTENTLOADED, new Page.WaitForLoadStateOptions().setTimeout(10000));
        System.out.println("成功跳转到游戏页面: " + page.url());
        Locator locator = page.locator("#gameDetail-iframe");
        for (int i = 0; i < locator.count(); i++) {
            System.out.println(locator.nth(i));
        }
        // 点击游戏
        FrameLocator frameLocator = page.frameLocator("#gameDetail-iframe");
        System.out.println(frameLocator);
        Locator gameStartButton = frameLocator.locator("//*[@id=\"jogos-bought-playnow\"]");
        gameStartButton.click();
        frameLocator.locator("//*[@id=\"connectionConfirm\"]").click();

        // 进入个人中心
        page.locator("//*[@id=\"app\"]/div[1]/header/section[2]/section[1]/section[2]/section[2]/img").click();

        // 基于公共组件的查找操作,
        // 原生查找动态元素方式
        page.evaluate("()=>{" +
                "document.querySelector('.el-drawer__body').children[0].children[0].children[4].children[0].children[3].click()" +
                "}");
        // 关闭定时
        page.querySelector(".userInfoProfile-avatar-camera").click();

        // 找.selectHead-container-li的下级的第一个元素
        page.querySelector(".selectHead-container-li > *:first-child").click();
        Page finalPage = page;
        FileChooser fileChooser = page.waitForFileChooser(() -> {
            // 点击元素触发文件选择对话框
            finalPage.click(".text-center.cursor-pointer > *:last-child");
        });
        // 设置文件路径
        fileChooser.setFiles(Paths.get("C:\\Users\\Administrator\\Desktop\\资源素材\\200x200\\IMG_202507245980_200x200.jpg"));
        Thread.sleep(1000);
        // 找到子元素的父元素
        page.evaluate("()=>{" +
                        "document.querySelector('.custom-button-primary-before').parentElement.click()" +
                        "}");
        Thread.sleep(3000);
        browser.close();
    }


}
