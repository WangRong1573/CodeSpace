package com.study.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 20:24  2020/2/24
 *用例执行层--业务层
 */
public class Login {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void login(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginStep("18272691567","yucheng2017","");
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
