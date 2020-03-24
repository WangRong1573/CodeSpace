package com.demo.login;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/22
 **/
@Listeners(TestListenerScreenShot.class)
public class ImoocDemo01 extends  BaseDriver{
    public void initDriver(){
        driver.findElement(By.cssSelector("a#js-signin-btn")).click();
    }

    //封装By
    public By getBy(String key){

        ProUtil proUtil = new ProUtil("element.properties");
        String local = proUtil.getPro(key);
        String localType = local.split(">")[0];
        String localValue = local.split(">") [1];

        if (localType.equals("id")){
            return By.id(localValue);
        }else if (localType.equals("name")){
            return By.name(localValue);
        }else if (localType.equals("cssSelector")){
            return By.cssSelector(localValue);
        }else if (localType.equals("linkText")){
            return By.linkText(localValue);
        }else if (localType.equals("className")){
            return By.className(localValue);
        }else if (localType.equals("xpath")){
            return By.xpath(localValue);
        }else if (localType.equals("tagName")){
            return By.tagName(localValue);
        }else {
            throw new RuntimeException("定位信息错误");
        }
    }

    //封装element
    public WebElement element(By by){
        WebElement element = driver.findElement(by);
        return element;
    }

    //等待
    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void loginScript(String username,String userpass){
        this.initDriver();

//        //用户名
//        String userBy="name";
//        String userElement="email";
//        //密码
//        String passBy="name";
//        String passElement="password";
//        //登录按钮
//        String buttonBy="className";
//        String buttonElement="moco-btn";
//        //header
//        String headerBy="id";
//        String headerElement="header-avator";
//        //text
//        String textBy="cssSelector";
//        String textElemnt=".text-ellipsis";

        element(getBy("userdata")).sendKeys(username);
        element(getBy("password")).sendKeys(userpass);
        element(getBy("button")).click();
        WebElement header = element(getBy("header"));
        Actions actions = new Actions(driver);
        actions.moveToElement(header).perform();
        String text = element(getBy("text")).getText();
        System.out.println(text);
        if (text.equals("慕仰2316096")){
            System.out.println("登录成功");
//            this.takeScreenShot();
            }else {
            System.out.println("请检查登录信息是否正确");
        }

        pause(2);
        driver.quit();
    }


//    public static void main(String[] args) {
//        ImoocDemo01 imoocDemo01 = new ImoocDemo01();
////        imoocDemo01.loginScript();
//
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("18272691567","yucheng201");
////        hashMap.put("18513199586","111111");
//        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> next = iterator.next();
//            String username = next.getKey().toString();
//            String password = next.getValue().toString();
////            System.out.println(username+"密码是："+password);
//            imoocDemo01.loginScript(username,password);
//        }
//    }

    @Test
    public void login(){
        this.loginScript("18272691567","yucheng2017");
    }
}
