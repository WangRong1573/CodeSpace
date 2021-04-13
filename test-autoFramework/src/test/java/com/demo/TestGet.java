package com.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.gettester.TestGetter;
import jdk.internal.util.EnvUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/13
 **/

public class TestGet {
    @BeforeTest
    public void beforeTest(){
        System.out.println("测试用例开始执行，时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Test
    public void testDoGet(){
        try {
            CloseableHttpResponse response = TestGetter.doGet();
            Assert.assertEquals(200,response.getStatusLine().getStatusCode());

            //将响应内容转为json
            HttpEntity entity = response.getEntity();
            String string = EntityUtils.toString(entity);
            JSONObject jsonObject = JSON.parseObject(string);
            System.out.println(jsonObject);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void afterTest(){
        System.out.println("测试用例执行完毕，时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
