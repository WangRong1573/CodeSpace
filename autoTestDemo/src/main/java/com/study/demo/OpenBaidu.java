package com.study.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * 打开百度首页练习
 * @author rong.wang
 * @date 23:34  2019/12/24
 */
public class OpenBaidu {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    public void test(){
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void afterTest(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
