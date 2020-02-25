package com.study.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:34  2020/2/24
 * pageFactory模式
 * 用于抽离driver对象
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
        driver.get("https://www.imooc.com/");
    }

    public void close(){
        driver.quit();
    }

    public LoginPage loginPage(){
        LoginPage loginPage=new LoginPage();
        return loginPage;
    }
}
