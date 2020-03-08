package com.frame.demo.base;

import com.frame.demo.model.Action;
import org.apache.log4j.Logger;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 17:33  2020/3/8
 *
 * 抽离driver对象及初始化操作
 */
public class GetDriver {

    private Logger logger=Logger.getLogger(GetDriver.class);

    public WebDriver driver;

    public WebDriver getDriver(String browerName){
        if (browerName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver=new ChromeDriver();
            return driver;
        }else if (browerName.equalsIgnoreCase("fireFox")){
            System.setProperty("","");
            driver=new FirefoxDriver();
            return driver;
        }else {
            throw new RuntimeException("请检查配置文件是否正确!!");
        }
    }

    public void open(){
        logger.info("打开163首页");
        loadPage();
        driver.get("https://mail.163.com/");
    }

    public void loadPage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
    }

    public void close(){
        logger.info("退出浏览器");
        driver.quit();
    }
}
