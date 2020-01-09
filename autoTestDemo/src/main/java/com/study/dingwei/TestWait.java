package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 22:14  2020/1/9
 * 硬等待和等待
 */
public class TestWait {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("file:///G:/自动化学习视频/六哥代码/实例网页/waitDemo.html");
        driver.manage().window().maximize();
    }

    @Test
    public void test1(){
        //硬等待,会造成等待时间超过资源加载时间造成时间浪费，使脚本运行效率降低
        driver.findElement(By.id("wait")).click();
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement greenBox = driver.findElement(By.id("green_box"));
        System.out.println(greenBox.getText());
    }

    @Test
    public void test2(){
        //设置全局等待，会智能等待页面加载，如设置等待时间为10s时，如果元素在5s出现，则不再继续等待，继续运行后续操作,超时会报错找不到元素
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //设置脚本超时时间
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        //页面加载超时
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.findElement(By.id("wait")).click();
        WebElement green_box = driver.findElement(By.id("green_box"));
        System.out.println(green_box);
    }
}
