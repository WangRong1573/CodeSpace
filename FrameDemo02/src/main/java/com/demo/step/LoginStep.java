package com.demo.step;

import com.demo.page.Actions;
import org.testng.Assert;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/19
 **/

public class LoginStep extends Actions {
    public void loginStep(String username,String password,String expected){
        open();
        click("密码登录");
        enterFrame();
        sendKeys("输入用户名",username);
        sendKeys("输入密码",password);
        click("点击登录");
        String text = getText("错误提示信息");
        Assert.assertEquals(text,expected);
        quit();
    }
}
