package com.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.restclient.RestClient;
import com.demo.util.ResourceUtil;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/13
 **/

public class TestPost {
    @Test
    public void testDoPost() {
        String host = ResourceUtil.getHost();
        String url = host + "/api/users";

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name","morpheus");
        map.put("job","leader");

        try {
            CloseableHttpResponse response = RestClient.doPost(url, map);

            Assert.assertEquals(ResourceUtil.RESPONSE_STATUS_CODE_201,
                    response.getStatusLine().getStatusCode(),"response status code is not 200");

            //将响应内容转为json
            HttpEntity entity = response.getEntity();
            String string = EntityUtils.toString(entity);
            JSONObject jsonObject = JSON.parseObject(string);
            System.out.println(jsonObject);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
