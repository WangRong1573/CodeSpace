package com.study.dingwei;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 22:02  2020/1/16
 * 调用js
 */
public class TestJS {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.baidu.com/");
    }

    @Test
    public void testJS(){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("alert('hello word!')");
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
    }
}
