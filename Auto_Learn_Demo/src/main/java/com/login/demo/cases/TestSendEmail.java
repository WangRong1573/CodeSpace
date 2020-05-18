package com.login.demo.cases;

import com.login.demo.steps.Steps;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:发送邮件
 * @Author rong.wang
 * @Date 2020/4/15
 **/

public class TestSendEmail {
    @Test
    public void sendEmail(){
        Steps steps = new Steps();
        steps.sendEmail("ethnic1573","yucheng201700",
                "815050758@qq.com","这是主题","测试输入内容");
    }
}
