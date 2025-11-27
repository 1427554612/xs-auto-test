package com.xs.auto.test.ui_auto_test.utils;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 截图工具类
 */
public class ScreensUtil {

    private String basePath  =  "d:/autotest";   // 截图保存位置
    private Page page;

    public ScreensUtil(Page page){
        this.page = page;
    }

    public ScreensUtil(Page page,String basePath){
        this.basePath = basePath;
        this.page = page;
    }

    /**
     * 截图方法
     * @param fileName
     */
    public String screen(String methodName,String fileName){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH");
        String format = simpleDateFormat.format(new Date());
        String currentFilePath = new StringBuilder(basePath).append("/")
                .append(format)
                .append("/")
                .append(methodName)
                .append("_")
                .append(fileName).toString();
        this.page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get(currentFilePath))
                .setFullPage(true));
        return currentFilePath;
    }

}
