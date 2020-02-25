package com.study.pagefactory;

import org.testng.annotations.Test;

/**
 * @author rong.wang
 * @date 21:58  2020/2/24
 */
public class Login {
    @Test
    public void login(){
        LoginStep loginStep=new LoginStep();
        loginStep.step("18272691567","yucheng2017","");
    }
}
