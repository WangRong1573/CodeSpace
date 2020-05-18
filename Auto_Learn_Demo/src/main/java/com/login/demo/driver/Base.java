package com.login.demo.driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:基类，声明driver并初始化
 * @Author rong.wang
 * @Date 2020/4/14
 **/

public class Base {
    public WebDriver driver;

    private Logger logger=Logger.getLogger(Base.class);

    public WebDriver getDriver(String broName) {
        if (broName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver=new ChromeDriver();
            return driver;
        }else if (broName.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }else {
            throw new RuntimeException("配置文件错误");
        }
    }

    public void loadPage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    }

    public void open(){
        loadPage();
        driver.get("https://mail.163.com/");
        logger.info("open 163page success");
    }

    public void quit(){
        driver.quit();
        logger.info("quit success");
    }

    public void pause(int i){
        try {
            Thread.sleep(1000*i);
            logger.info("wait"+i+"second");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
