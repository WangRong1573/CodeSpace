package com.study.dingwei;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:39  2020/1/16
 * cookie相应api
 */
public class TestCookie {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCookie(){
        driver.get("https://www.baidu.com/");
        //获取cookie集合
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.size());
        for (Cookie coo:cookies) {
            String name = coo.getName();
            String value = coo.getValue();
            System.out.println(name+":"+"\t"+value);
        }
        //cookie删除
        //删除单个cookie

        //删除所有cookie
        driver.manage().deleteAllCookies();
        System.out.println(cookies.size());

        //添加cookie
        Cookie cookie = new Cookie("name", "value");
        driver.manage().addCookie(cookie);
        System.out.println(cookies.size());

    }
}
