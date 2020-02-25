package com.study.pagefactory2;

import org.testng.annotations.Test;

/**
 * @author rong.wang
 * @date 21:38  2020/2/25
 */
public class TestPageFactory {
    @Test
    public void testPageFactory(){
        LoginStep loginStep=new LoginStep();
        loginStep.loginStep("18272691567","123456","帐号或密码错误");
    }
}
