package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/7
 **/

public class TestClick {
    /**
     * 1.打开百度首页
     * 2.输入框输入selenium
     * 3.点击百度一下进行搜索
     * 4.判断title是否为“selenium_百度搜索”
     */
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test
    public void testClick() throws InterruptedException {
        driver.get("https://www.baidu.com/");
        driver.findElement(By.id("kw")).sendKeys("selenium");
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        Assert.assertEquals(title,"selenium_百度搜索");
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
