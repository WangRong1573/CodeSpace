package com.imooc.cases;

import com.imooc.business.Operate;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:测试登录
 * @Author rong.wang
 * @Date 2020/3/31
 **/

public class TestLogin {

    @Test
    @Parameters({"username","password"})
    public  void testLogin(String username, String password){
        new Operate().login(username,password,"weixin_且随疾风前行_0");
    }
}
