package com.imooc.cases;

        import com.imooc.base.DriverBase;
        import com.imooc.business.Operate;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.AfterTest;
        import org.testng.annotations.Parameters;
        import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:测试立即购买
 * @Author rong.wang
 * @Date 2020/3/31
 **/

public class TestBuy {
    @Test
    @Parameters({"username", "password"})
    public void testBuy(String username, String password) {
        Operate operate = new Operate();
        operate.login(username, password, "weixin_且随疾风前行_0");
        operate.buy();
    }
}
