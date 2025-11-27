//package com.xs.auto.test.ui_auto_test.script;
//
////import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.util.List;
//
//public class SeleniumService {
//    public static void main(String[] args) throws InterruptedException {
////        WebDriverManager.chromedriver().driverVersion("140.0.7259.2").setup();
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome Dev\\Application\\chrome.exe");
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        driver.get("https://www.jogospre.com");
//        System.out.println("Title: " + driver.getTitle());
//        List<WebElement> a_link_element = driver.findElements(By.xpath("//a[contains(@href, 'module-')]"));
//        for (WebElement webElement : a_link_element) {
//            webElement.click();
//            Thread.sleep(3000);
//            List<WebElement> game_details = driver.findElements(By.xpath("//a[contains(@href,'detail?gameId=')]"));
//            for (WebElement game_detail : game_details) {
//                game_detail.click();
//                Thread.sleep(3000);
//            }
//
//        }
//    }
//}
