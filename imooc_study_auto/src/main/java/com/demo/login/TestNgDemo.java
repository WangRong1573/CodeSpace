package com.demo.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:testng依赖测试练习
 * @Author rong.wang
 * @Date 2020/3/23
 **/

public class TestNgDemo {
    WebDriver driver;

    @Test
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(dependsOnMethods = "initDriver")
    public void autoTest(){
        driver.findElement(By.id("kw")).sendKeys("testng jar");
        driver.findElement(By.id("su")).click();
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
