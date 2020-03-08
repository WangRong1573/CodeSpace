package com.frame.demo.test;

import com.frame.demo.loginpage.LoginPage;
import org.junit.Test;

/**
 * @author rong.wang
 * @date 18:39  2020/3/8
 */
public class TestFrame {
    @Test
    public void testFrame(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("xiaoqiang","1","请先进行验证");
    }
}
