package com.frame.driver;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/26
 **/

public class GetDriver {
    private Logger logger=Logger.getLogger(GetDriver.class);
    public WebDriver driver;

    public WebDriver getDriver(String broName) {
        if (broName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            return new ChromeDriver();
        }else if (broName.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }else if (broName.equalsIgnoreCase("ie")){
            return new InternetExplorerDriver();
        }else {
            throw new RuntimeException("请检查配置文件");
        }
    }

    //初始化
    public void initDriver(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //打开
    public void open(){
        logger.info("初始化driver成功");
        logger.info("打开百度首页");
        initDriver();
        driver.get("https://www.baidu.com/");
    }

    //进入iframe
    public void enterFrame(){
        logger.info("切换进入iframe");
        driver.switchTo().frame(0);
    }

    //退出
    public void quit(){
        logger.info("退出浏览器");
        driver.quit();
    }

    //等待
    public void pause(int i){
        logger.info("脚本暂停"+i+"秒");
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //通过url的关键字，判断是否有新窗口产生，如果有则切换到新窗口，并关闭原窗口
    public void isNewWindowCreat(String str){
        logger.info("有新句柄产生，执行关闭旧窗口，切换新窗口操作");
        WebDriver wantedWindow=null;
        //遍历当前窗口句柄
        for (String child:driver.getWindowHandles()) {
            WebDriver window = driver.switchTo().window(child);
            if (window.getCurrentUrl().contains(str)){
                wantedWindow=window;
                break;
            }else {
                driver.close();
            }
        }
        if (wantedWindow!=null){
            logger.info("new page url is:  "+wantedWindow.getCurrentUrl());
        }
    }

    //自动截图
    public void screenShot(){
        //获取当前时间戳并以当前时间戳命名图片
        long date = System.currentTimeMillis();
        String path = String.valueOf(date);
        path=path+".png";
        //获取当前路径
        String property = System.getProperty("user.dir");
        //图片路径为当前路径+“/”+图片名称
        String screenPath=property+"/"+path;
        File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotAs, new File(screenPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
