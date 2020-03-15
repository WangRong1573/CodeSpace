package com.pagefactory.demo.taobao;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:抽离driver对象
 * @Author rong.wang
 * @Date 2020/3/12
 **/

public class BasePage {
    private static WebDriver driver;
    private Logger logger=Logger.getLogger(BasePage.class);

    public static WebDriver getDriver() {
        return driver;
    }

    //通过构造器初始化driver对象
    public void loadPage() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
    }

    //打开浏览器
    public void open(){
        loadPage();
        driver.get("https://www.baidu.com/");
    }

    //关闭浏览器
    public void close(){
        driver.quit();
    }

    //硬等待
    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //判断是否有新窗口产生，如果有则切换到新窗口
    public void creatNewWindow(String str){
        WebDriver wantedWindow = null;
        for (String childTab : driver.getWindowHandles()) {
            WebDriver window = driver.switchTo().window(childTab);
            if (window.getCurrentUrl().contains(str)) {
                wantedWindow = window;
                break;
            }else {
                driver.close();
            }
        }
        if (wantedWindow != null) {
            logger.info("New page URL is:" + wantedWindow.getCurrentUrl());
        }
    }
}
