package com.demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:截图
 * @Author rong.wang
 * @Date 2020/4/7
 **/

public class TestShot {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
    }
    @Test
    public void testClick() throws InterruptedException {
        File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotAs, new File("D:\\test.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
