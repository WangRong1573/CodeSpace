package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:58  2020/1/8
 * 常用api
 */
public class TestElementApi {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test(){
        WebElement element = driver.findElement(By.id("su"));
        //获取元素属性值
        String value = element.getAttribute("value");
        System.out.println(value);
        //获取元素css样式
        String cssValue = element.getCssValue("background-color");
        System.out.println(cssValue);
        //获取元素所在位置，坐标
        Dimension size = element.getSize();
        System.out.println(size);
        //获取元素所在标签名
        String tagName = element.getTagName();
        System.out.println(tagName);

        //获取元素文本
        WebElement video = driver.findElement(By.linkText("视频"));
        System.out.println(video.getText());
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
