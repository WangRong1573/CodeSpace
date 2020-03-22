package com.demo.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/22
 **/

public class ImoocDemo01 {
    WebDriver driver;
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void loginScript(){
        this.initDriver();
        driver.findElement(By.cssSelector("a#js-signin-btn")).click();
        driver.findElement(By.name("email")).sendKeys("18272691567");
        driver.findElement(By.name("password")).sendKeys("yucheng2017");
        driver.findElement(By.className("moco-btn")).click();
        WebElement element = driver.findElement(By.id("header-avator"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        System.out.println(element.getText());
    }

    public static void main(String[] args) {
        ImoocDemo01 imoocDemo01 = new ImoocDemo01();
        imoocDemo01.loginScript();
    }
}
