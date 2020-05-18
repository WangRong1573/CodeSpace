package com.login.demo.cases;

import com.login.demo.steps.Steps;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:登录失败测试用例
 * @Author rong.wang
 * @Date 2020/4/15
 **/

public class TestLoginFail {
    @DataProvider(name = "failDatas")
    public Object[][] testDatas(){
        return new Object[][]{
                {"","yucheng201700"},
                {"W17317583532",""},
                {"",""},
                {"W17317583532","122134"}
        };
    }

    @Test(dataProvider = "failDatas")
    public void testFail(String username,String password){
        Steps steps = new Steps();
        steps.loginFail(username, password);
    }
}
