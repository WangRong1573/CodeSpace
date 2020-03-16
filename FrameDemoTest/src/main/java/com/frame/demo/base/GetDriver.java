package com.frame.demo.base;

import com.frame.demo.model.Actions;
import org.apache.log4j.Logger;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:抽离driver对象及初始化操作
 * @Author rong.wang
 * @Date 2020/3/16
 **/

public class GetDriver {
    public WebDriver driver;
    private Logger logger=Logger.getLogger(GetDriver.class);

    public WebDriver getDriver(String browerName) {
        if (browerName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            return new ChromeDriver();
        }if (browerName.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }if (browerName.equalsIgnoreCase("ie")){
            return new InternetExplorerDriver();
        }else {
            throw new RuntimeException("请检查配置文件是否正确!");
        }
    }

    public void open(){
        logger.info("打开163成功");
        loadPage();
        driver.get("https://mail.163.com/");
    }

    public void close(){
        logger.info("退出浏览器");
        driver.quit();
    }

    public void loadPage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
    }

}
