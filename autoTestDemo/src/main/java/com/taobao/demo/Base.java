package com.taobao.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:38  2020/3/5
 */
public class Base {
    private static WebDriver driver;

    public static WebDriver getDriver(WebDriver driver){
        return driver;
    }

    public Base() {
        System.setProperty("webdrive.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //打开页面
    public void open(){
        driver.get("");
    }

    //关闭页面
    public void close(){
        driver.quit();
    }

    //硬等待
    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
