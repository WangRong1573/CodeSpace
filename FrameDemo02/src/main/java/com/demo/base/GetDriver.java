package com.demo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/18
 **/

public class GetDriver {
    public WebDriver driver;

    public WebDriver getDriver(String broName){
        if (broName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            return new ChromeDriver();
        }else if (broName.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }else if (broName.equalsIgnoreCase("ie")){
            return new InternetExplorerDriver();
        }else {
            throw new RuntimeException("请检查配置文件是否正确");
        }
    }

    public void loadPage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    }

    //打开页面
    public void open(){
        loadPage();
        driver.get("https://mail.163.com/");
    }

    //退出
    public void quit(){
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

}
