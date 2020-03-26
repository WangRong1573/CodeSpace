package com.frame.steps;

import com.frame.page.UserActions;
import org.testng.Assert;


/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:操作层，操作步骤
 * @Author rong.wang
 * @Date 2020/3/26
 **/
public class LoginSteps extends UserActions {
    public void loginStep(String str,String username,String password,String expected){
        open();
        sendKey("input",str);
        click("search");
        click("emailLink");
        isNewWindowCreat("mail.163");
        click("login");
        enterFrame();
        sendKey("username",username);
        sendKey("password",password);
        click("autologin");
        click("loginBtn");
        String error = getError("errmsg");
        Assert.assertEquals(error,expected);
        pause(2);
        quit();
    }
}
