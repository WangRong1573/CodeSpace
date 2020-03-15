package com.pagefactory.demo.taobao;

import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/12
 **/

public class TestTaobao {
    @Test
    public void testTaobao(){
        Action action = new Action();
        action.actions("淘宝","21545","445445",
                "为确保您账户的安全及正常使用，依《网络安全法》相关要求，6月1日起会员账户需绑定手机。如您还未绑定，请尽快完成，感谢您的理解及支持！",
                "taobao","login");
    }
}
