package com.study.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * selenium的一些简单api练习，以及定位元素的练习，简单的封装
 * @author rong.wang
 * @date 20:36  2020/1/1
 */
public class OpenImooc {

    WebDriver driver;

    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","G:\\CodeSpace\\autoTestDemo\\chromedriver.exe");
        driver=new ChromeDriver();
        //打开慕课网
        driver.get("https://class.imooc.com/?mc_marking=4e0b0537f151197140fed11920097988&mc_channel=bdqdrmjt");
        //窗口最大化
        driver.manage().window().maximize();
    }

    public void login(){
        driver.findElement(By.linkText("登录")).click();
        driver.findElement(By.xpath(".//*[@id='signup-form']/div[1]/input")).sendKeys("815050758@qq.com");
        driver.findElement(By.xpath(".//*[@id='signup-form']/div[2]/input")).sendKeys("sssss");
        driver.findElement(By.xpath(".//*[@id='signup-form']/div[5]/input")).click();
    }


    public static void main(String[] args) {

        OpenImooc oi=new OpenImooc();
        oi.initDriver();
        oi.login();
    }
}
