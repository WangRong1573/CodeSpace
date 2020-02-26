package com.study.pageobject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 20:09  2020/2/26
 */
public class Test {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @org.testng.annotations.Test
    public void test(){
        Step step = new Step(driver);
        step.searchText("selenium学习");
    }
}
