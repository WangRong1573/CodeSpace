package com.demo.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:练习打开百度首页到打开慕课网，点击登录，进入个人中心
 * @Author rong.wang
 * @Date 2020/3/22
 **/

public class LoginDemo {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test(){
        //当前窗口句柄
        String oldWindow = driver.getWindowHandle();
        //输入框
        driver.findElement(getBy("name","wd")).sendKeys("慕课网");
        //“百度一下”按钮
        driver.findElement(getBy("id","su")).click();

        driver.findElement(getBy("linkText","慕课网-程序员的梦工厂")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        //遍历窗口句柄
        for (String window:windowHandles) {
            //如果oldWindow不等于window则说明有新窗口产生，执行关闭原窗口操作，并切换到新窗口
            if (!oldWindow.equals(window)){
                driver.switchTo().window(window);
                break;
            }else {
                driver.close();
            }
        }
        //css定位登录按钮并点击
        driver.findElement(getBy("cssSelector","a#js-signin-btn")).click();

        driver.findElement(getBy("name","email")).sendKeys("18272691567");

        driver.findElement(getBy("name","password")).sendKeys("yucheng2017");

        driver.findElement(getBy("className","moco-btn")).click();

        WebElement userHeader = driver.findElement(getBy("id", "header-avator"));
        //鼠标移动到头像
        Actions actions = new Actions(driver);
        actions.moveToElement(userHeader).perform();

        //获取用户名信息
        String userText = driver.findElement(getBy("cssSelector", ".text-ellipsis")).getText();
        System.out.println(userText);

        Assert.assertEquals(userText,"慕仰2316096");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    public WebElement findElement(String method,String methodValue){

        return driver.findElement(getBy(method,methodValue));
    }

    //封装By
    public By getBy(String method,String methodValue){
        By by;
        if (method.equalsIgnoreCase("id")){
            by=By.id(methodValue);
        }else if (method.equals("name")){
            by=By.name(methodValue);
        }else if (method.equals("xpath")){
            by=By.xpath(methodValue);
        }else if (method.equals("className")){
            by=By.className(methodValue);
        }else if (method.equals("cssSelector")){
            by=By.cssSelector(methodValue);
        }else if (method.equals("linkText")){
            by=By.linkText(methodValue);
        }else {
            throw new RuntimeException("元素定位异常");
        }
        return by;
    }
}
