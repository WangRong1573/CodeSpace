package com.study.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**模拟从百度输入框输入淘宝网，并点击搜索，选择淘宝网，点击登录，登录账号，并判断是否登录成功
 * @author rong.wang
 * @date 21:31  2020/1/1
 */
public class OpenTaobao {
    WebDriver driver;

    public WebDriver driver(){
        System.setProperty("webdriver.chrome.driver","G:\\CodeSpace\\autoTestDemo\\chromedriver.exe");
        driver=new ChromeDriver();
        return driver;
    }

    public void openBaidu(){
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys("淘宝网");
        driver.findElement(By.id("su")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openTaobao(){
        driver.findElement(By.linkText("淘宝网 - 淘!我喜欢")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("[data-spm-anchor-id='a21bo\\.2017\\.754894437\\.1']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.linkText("密码登录")).click();
        driver.findElement(By.id("TPL_username_1")).sendKeys("18272691567");
        driver.findElement(By.id("TPL_password_1")).sendKeys("12345678");
        driver.findElement(By.className("J_Submit")).click();
    }

    public static void main(String[] args) {
        OpenTaobao ot=new OpenTaobao();
        ot.driver();
        ot.openBaidu();
        ot.openTaobao();
    }
}
