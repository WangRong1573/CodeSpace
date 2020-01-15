package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:00  2020/1/15
 * 定位基础：切近iframe的集中方式
 */
public class TestIframe {
    WebDriver driver;

    @BeforeClass
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("file:///G:/%E8%87%AA%E5%8A%A8%E5%8C%96%E5%AD%A6%E4%B9%A0%E8%A7%86%E9%A2%91/%E5%85%AD%E5%93%A5%E4%BB%A3%E7%A0%81/%E5%AE%9E%E4%BE%8B%E7%BD%91%E9%A1%B5/iframeDemo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void testIframe(){
//        //使用id切入
//        driver.switchTo().frame("iframe");

//        //使用name切入
//        driver.switchTo().frame("iframeName");

//        //使用iframe索引切入
//        driver.switchTo().frame(0);

        //使用元素对象切入
        WebElement iframe = driver.findElement(By.id("iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.id("user")).sendKeys("dssssssssssss");
    }

    @AfterClass
    public void afterClass(){
        pause(2);
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
