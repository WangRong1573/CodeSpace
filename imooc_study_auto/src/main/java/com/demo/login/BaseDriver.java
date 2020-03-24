package com.demo.login;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/24
 **/

public class BaseDriver {
    WebDriver driver;

    public BaseDriver() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //自动截图
    public void screenShot(){
        //获取当前时间
        long l = System.currentTimeMillis();
        //获取当前路径
        String property = System.getProperty("user.dir");
        //以时间命名图片
        String path = String.valueOf(l);
        path=path+".png";
        //图片路径
        String screenPath=property+"/"+path;
        //截图
        File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotAs, new File(screenPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
