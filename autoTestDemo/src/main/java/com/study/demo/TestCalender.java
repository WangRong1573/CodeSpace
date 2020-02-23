package com.study.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 20:30  2020/2/23
 * 日历控件操作
 */
public class TestCalender {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://huoche.cncn.com/train-%C9%CF%BA%A3-%B1%B1%BE%A9?date=2020-02-25");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//    @Test
    public void testCalendar1(){
        driver.findElement(By.id("date")).click();
        WebElement iframe = driver.findElement(By.cssSelector("div:nth-of-type(12) > iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.cssSelector("tr:nth-of-type(6) > td:nth-of-type(5)")).click();
    }

    //第二种方式，使用js移除readonly属性
    @Test
    public void testCalendar2(){
        String jsStr="document.getElementById(\"date\").removeAttribute('readonly')";
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript(jsStr);
        driver.findElement(By.id("date")).clear();
        driver.findElement(By.id("date")).sendKeys("2020-2-27");
        driver.findElement(By.id("searchBtn")).click();
    }
}
