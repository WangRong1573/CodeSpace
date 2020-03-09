package com.pagefactory.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:31  2020/3/9
 * 抽离driver对象并初始化
 */
public class Base {
    static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public Base() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    }

    /**
     * 打开浏览器
     */
    public void open(){
        driver.get("https://mail.163.com/");
    }

    /**
     * 进入iframe
     */
    public void enterIframe(){
        driver.switchTo().frame(0);
    }

    /**
     * 退出
     */
    public void quit(){
        driver.quit();
    }

    /*
    *硬等待
     */
    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
