package com.study.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 19:24  2020/1/9
 * 抽离driver对象，定义基础的方法
 */
public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    //基础信息
    public BasePage() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    //点击“密码登录”按钮
    public void btn_password(){
        driver.findElement(By.id("switchAccountLogin")).click();
    }

    //打开网页
    public void open(){
        driver.get("https://mail.163.com/");
    }

    //关闭页面
    public void close(){
        driver.quit();
    }

    public  void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
