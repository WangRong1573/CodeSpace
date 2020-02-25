package com.study.pagefactory2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * 抽离driver对象
 * @author rong.wang
 * @date 21:06  2020/2/25
 */
public class BasePage {

    public static WebDriver driver;
    public static WebDriver getDriver(){
        return driver;
    }

    public BasePage() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void open(){
        driver.get("https://mail.163.com/");
    }

    public void goIframe(){
        driver.switchTo().frame(0);
    }

    public void close(){
        driver.quit();
    }

    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ElementPage elementPage(){
        ElementPage elementPage=new ElementPage();
        return elementPage;
    }
}
