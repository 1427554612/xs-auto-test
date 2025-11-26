package com.xs.auto.test.ui_auto_test.po;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.WaitUntilState;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class HomePage {

    private Page page;

    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 进入主页，判断滚动条
     * @return
     */
    public void forHome(String url){
        page.navigate(url, new Page.NavigateOptions().setWaitUntil(WaitUntilState.DOMCONTENTLOADED));
        // 判断页面标题是否是Jogos
        assertThat(page).hasTitle("Jogos");
    }

    /**
     * 通过滚动条
     * @return
     */
    public void scrollBar(){
        this.page.locator("div.year-13-scroll").evaluate("element => element.scrollTo(0, element.scrollHeight)");
        this.page.locator("//*[@id=\"app\"]/div[3]/div/div[3]/div").click();
    }

    /**
     * 切换回主页
     * @return
     */
    public void gotoHome(){
        Locator logo = this.page.locator(".logo > :first-child");
        logo.click();
    }

    /**
     * 切换聚合页
     * @return
     */
    public void selectGamePage() {
        Locator selector = page.locator("//*[@id=\"app\"]/div[2]/div/div[1]/div/section/section/section/section[1]");
        Locator childrenSelector = selector.locator("> *");
        assertThat(childrenSelector).hasCount(5);
        // 避免太快
        for (int i = 1; i < childrenSelector.count(); i++) {
            Locator nth = childrenSelector.nth(i);
            try {
                Thread.sleep(500);
            }catch (Exception e){

            }
            nth.click();
            // 重定向到新地址
            BrowserContext context1 = page.context();
            Page newPage = context1.pages().get(context1.pages().size() - 1);
            newPage.bringToFront(); // 重要：确保新页面在前台
            newPage.waitForLoadState(LoadState.DOMCONTENTLOADED);
            //assertThat(newPage.locator(".CollectionContent-tit.flex.flex_item_mid.justify-between > :first-child > :nth-child(2)")).hasText(nth.textContent());
     }
    }
}
