package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:20  2020/1/9
 * 拖拽练习
 */
public class TestDrap {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("file:///G:/%E8%87%AA%E5%8A%A8%E5%8C%96%E5%AD%A6%E4%B9%A0%E8%A7%86%E9%A2%91/%E9%A9%B1%E5%8A%A8/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test(){
        WebElement element = driver.findElement(By.id("A"));
        WebElement first = driver.findElement(By.xpath("html/body/div[1]/ul[2]"));
        WebElement second = driver.findElement(By.xpath("html/body/div[1]/ul[3]"));
        Actions actions=new Actions(driver);
//        //先按住元素，在拖拽
//        actions.clickAndHold(element).moveToElement(second).release().perform();
//        //直接拖拽
//        actions.dragAndDrop(element,first).perform();

        //拖拽两次
        actions.clickAndHold(element).moveToElement(first).moveToElement(second).release().perform();
    }
}
