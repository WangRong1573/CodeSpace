package com.imooc.po.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author rong.wang
 * @date 20:14  2020/2/26
 * 封装通过传入不同的浏览器来使用不同的浏览器driver来执行脚本
 */
public class SelectDriver {
    WebDriver driver;
    public WebDriver getDriver(String browerName){
        if (browerName.equalsIgnoreCase("firefox")){
            System.setProperty("","");
            return new FirefoxDriver();
        }else if (browerName.equalsIgnoreCase("ie")){
            System.setProperty("","");
            return new InternetExplorerDriver();
        }else {
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            return new ChromeDriver();
        }
    }
}
