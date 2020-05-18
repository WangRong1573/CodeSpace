package com.login.demo.cases;

import com.login.demo.steps.Steps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:登录成功测试用例
 * @Author rong.wang
 * @Date 2020/4/15
 **/

public class TestLoginSuccess {

    @DataProvider(name = "datas")
    public Object[][] testDatas(){
        return new Object[][]{
                {"ethnic1573","yucheng201700"},
                {"W17317583532","yucheng201700"}
        };
    }

    @Test(dataProvider = "datas")
    public void testLoginSuccess(String username,String password){
        Steps steps = new Steps();
        steps.loginSuccess(username,password);
    }
}
