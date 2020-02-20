package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 20:01  2020/2/20
 * 模拟百度首页输入京东--点击进入京东商城--点击登录--账户登录--输入账户名密码--点击登录过程，并增加窗口句柄判断，如果打开在新的页面打开则关闭原来的页面
 *
 */
public class TestSwitchWindow2 {
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
    public void testSeitchWindow(){
        driver.findElement(By.id("kw")).sendKeys("京东");
        driver.findElement(By.id("su")).click();
        pause(3);
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("京东JD.COM官网 多快好省 只为品质生活")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window:windowHandles) {
            if (!windowHandle.equals(window)){
                driver.switchTo().window(window);
                break;
            }else {
                driver.close();
            }
        }
        driver.findElement(By.linkText("你好，请登录")).click();
        pause(2);
        driver.findElement(By.linkText("账户登录")).click();
        pause(2);
        driver.findElement(By.id("loginname")).sendKeys("username");
        driver.findElement(By.id("nloginpwd")).sendKeys("password");
        driver.findElement(By.linkText("登    录")).click();
    }

    @AfterTest
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
