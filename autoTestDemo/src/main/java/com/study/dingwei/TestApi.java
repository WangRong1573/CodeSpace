package com.study.dingwei;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**api部分练习
 * @author rong.wang
 * @date 21:37  2020/1/6
 */
public class TestApi {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }
    @Test
    public void test(){
        //窗口最大化
        driver.manage().window().maximize();
        //打开网页
        driver.get("https://www.baidu.com/");
        //跳转到某个页面
        driver.navigate().to("https://www.bilibili.com/account/history");
        //返回上个页面
        driver.navigate().back();
        //回到上一页面
        driver.navigate().forward();
        //指定窗口打开位置
        driver.manage().window().setPosition(new Point(300,500));
        //指定窗口大小
        driver.manage().window().setSize(new Dimension(500,800));
        //刷新页面
        driver.navigate().refresh();
        //全屏显示
        driver.manage().window().fullscreen();
        //获取页面title
        String title = driver.getTitle();
        System.out.println(title);
        //获取当前页面url
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        //获取页面源代码
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);


    }

    @AfterTest
    public void afterTest(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //退出浏览器
        driver.quit();
//        //关闭某个页面
//        driver.close();
    }
}
