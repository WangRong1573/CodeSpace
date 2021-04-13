package com.demo.gettester;

import com.demo.util.ResourceUtil;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/13
 **/

public class TestGetter {

    public static CloseableHttpResponse doGet() throws IOException {
        //1.请求url
        String path = "/api/users/2";
        String host = ResourceUtil.getHost();
        String url = host + path;

        //2.请求方式  get
        HttpGet get = new HttpGet(url);

        /*
        发送请求
            1.建立请求客户端
            2.执行请求
        */
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse httpResponse = httpClient.execute(get);
        return httpResponse;
    }
}
