package com.imooc.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:抽离driver并初始化
 * @Author rong.wang
 * @Date 2020/3/31
 **/

public class DriverBase {
    public WebDriver driver;
    private Logger logger = Logger.getLogger(DriverBase.class);

    /**
     * 通过浏览器名称初始化driver
     *
     * @param broName
     * @return
     */
    public WebDriver getDriver(String broName) {
        if (broName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            return driver;
        } else if (broName.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else if (broName.equalsIgnoreCase("ie")) {
            return new InternetExplorerDriver();
        } else {
            throw new RuntimeException("请检查配置文件是否正确");
        }
    }

    //设置页面元素加载时间
    public void init() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

    //打开慕课网实战课程页面
    public void open() {
        init();
        driver.get("https://coding.imooc.com/");
        logger.info("打开实战课程页面");
    }

    //退出
    public void quit() {
        driver.quit();
        logger.info("退出浏览器");
    }

    //等待
    public void pause(int i){
        logger.info("等待"+i+"秒");
        try {
            Thread.sleep(1000 * i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据url关键字来判断是否有新页面产生，有则切换到新窗口执行操作，并关闭旧窗口
     *
     * @param urlString
     */
    public void newWindowCreat(String urlString) {
        WebDriver wantedWindow = null;
        for (String window : driver.getWindowHandles()) {
            WebDriver actualWindow = driver.switchTo().window(window);
            if (actualWindow.getCurrentUrl().contains(urlString)) {
                wantedWindow = actualWindow;
                break;
            } else {
                driver.close();
            }
        }
        if (wantedWindow != null) {
            logger.info("page url is :" + wantedWindow.getCurrentUrl());
        }
    }
}
