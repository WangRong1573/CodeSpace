package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:19  2020/1/16
 * 下拉选框api练习
 */
public class TestSelect {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testSelect(){
        driver.get("file:///G:/%E8%87%AA%E5%8A%A8%E5%8C%96%E5%AD%A6%E4%B9%A0%E8%A7%86%E9%A2%91/%E5%85%AD%E5%93%A5%E4%BB%A3%E7%A0%81/%E5%AE%9E%E4%BE%8B%E7%BD%91%E9%A1%B5/SelectDemo.html");
        WebElement select = driver.findElement(By.id("select"));
        //初始化select控件对象
        Select s = new Select(select);
        //通过可见文本选择
        s.selectByVisibleText("典韦");
        pause(2);
        //通过value值选择
        s.selectByValue("4");
        pause(2);
        //通过元素索引选择
        s.selectByIndex(0);

        //获取所选择元素文本
        String text = s.getFirstSelectedOption().getText();
        System.out.println(text);


        //是否支持全选
        boolean multiple = s.isMultiple();
        System.out.println(multiple);

        //获取所有选中的元素集合
        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
        System.out.println(allSelectedOptions.size());
        for (WebElement alo:allSelectedOptions) {
            System.out.println(alo.getText());
        }

        //获取所有可选项
        List<WebElement> options = s.getOptions();
        System.out.println(options.size());
        for (WebElement op:options) {
            System.out.println(op.getText());
        }

    }

    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void afterClass(){
        pause(2);
        driver.quit();
    }
}
