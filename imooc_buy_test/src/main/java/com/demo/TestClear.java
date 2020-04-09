package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/7
 **/

public class TestClear {
    /**
     * 1.打开百度首页
     * 2.获取百度一下按钮value属性值
     * 3.断言是否为百度一下
     */
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void testClick() throws InterruptedException {
        WebElement su = driver.findElement(By.id("su"));
        boolean displayed = su.isDisplayed();
        Assert.assertTrue(displayed);
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }

    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
