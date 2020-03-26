package com.frame.test;

import com.frame.steps.LoginSteps;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/26
 **/
//@Listeners(TakeScreenShotListener.class)
public class TestLogin {
    @Test
    public void testLogin(){
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.loginStep("163邮箱","","","请输入帐号");
    }
}
