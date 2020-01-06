package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * 元素点击操作，button按钮练习案例
 * @author rong.wang
 * @date 22:21  2020/1/6
 */
public class TestButton {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("file:///G:/%E8%87%AA%E5%8A%A8%E5%8C%96%E5%AD%A6%E4%B9%A0%E8%A7%86%E9%A2%91/%E5%85%AD%E5%93%A5%E4%BB%A3%E7%A0%81/%E5%AE%9E%E4%BE%8B%E7%BD%91%E9%A1%B5/Button.html");
        driver.manage().window().maximize();
    }

    @Test
    public void testButton(){
//        driver.findElement(By.id("button1")).click();
//        WebElement element = driver.findElement(By.id("button1"));
//        boolean isDisplayed = element.isDisplayed();
//        System.out.println(isDisplayed);
//        if (isDisplayed){
//            element.click();
//        }

        WebElement button2 = driver.findElement(By.id("button2"));
        boolean button2Displayed = button2.isDisplayed();
        boolean enabled = button2.isEnabled();
        if (button2Displayed && enabled){
            button2.click();
        }else {
            System.out.println("按钮不可点击");
        }
    }
}
