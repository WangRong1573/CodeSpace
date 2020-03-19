package com.demo.test;

import com.demo.step.LoginStep;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/19
 **/

public class Test {
    @org.testng.annotations.Test
    public void testLogin(){
        LoginStep loginStep = new LoginStep();
        loginStep.loginStep("","","请输入帐号");
    }
}
