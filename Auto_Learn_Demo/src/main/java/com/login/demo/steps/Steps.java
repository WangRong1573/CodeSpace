package com.login.demo.steps;

import com.login.demo.handles.Handles;
import org.testng.Assert;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/15
 **/

public class Steps extends Handles {

    public void login(String username, String password){
        open();
        click("密码登录");
        enterFrame();
        sendKeys("用户名",username);
        sendKeys("密码",password);
        click("登录");
    }

    //登录成功
    public  void loginSuccess(String username, String password){
        login(username, password);
        String text = getText("退出");
        Assert.assertEquals(text,"退出");
        pause(2);
        quit();
    }

    //登录失败
    public void loginFail(String username, String password){
       login(username, password);
        boolean error = getText("error").isEmpty();
        Assert.assertFalse(error);
        pause(2);
        quit();
    }

    //发送邮件
    public void sendEmail(String username, String password,String emailEdress,String mainWords,String text){
        login(username, password);
        pause(2);
        click("写信");
        sendKeys("收件人",emailEdress);
        sendKeys("主题",mainWords);
        sendKeys("添加附件","C:\\Users\\Administrator\\Desktop\\IMG_5250.JPG");
        enterFrame();
        click("文本框body");
        sendKeys("输入区域",text);
        boolean b = getText("成功文本").contains("发送成功");
        Assert.assertTrue(b);
        pause(2);
        quit();
    }
}
