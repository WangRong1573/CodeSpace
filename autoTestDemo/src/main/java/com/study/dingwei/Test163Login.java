package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:25  2020/1/15
 * 模拟从百度搜索163，进入163登录页面，点击密码登录，进入iframe输入账号密码
 */
public class Test163Login {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void test163Login(){
        driver.get("https://www.baidu.com/");
        //获取百度首页窗口句柄
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.id("kw")).sendKeys("163");
        driver.findElement(By.id("su")).click();
        driver.findElement(By.linkText("163网易免费邮箱官方登录")).click();
        //获取当前窗口句柄集合
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window:windowHandles) {
            if (!windowHandle.equals(window)){
                driver.switchTo().window(window);
                break;
            }else {
                driver.close();
            }
        }
        driver.findElement(By.linkText("密码登录")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.name("email")).sendKeys("your name");
        driver.findElement(By.name("password")).sendKeys("12454");
        driver.findElement(By.id("un-login")).click();
        driver.findElement(By.id("dologin")).click();
        String element = driver.findElement(By.className("ferrorhead")).getText();
        System.out.println(element);
    }

    @AfterClass
    public void afterTest(){
        pause(3);
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
