package com.demo.restclient;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.*;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/13
 **/

public class RestClient {

    /**
     * 无参get请求
     * @param url
     * @return
     * @throws IOException
     */
    public static CloseableHttpResponse doGet(String url) throws IOException {
        HttpGet get = new HttpGet(url);

        CloseableHttpResponse response = HttpClients.createDefault().execute(get);

        return response;
    }

    /**
     * 带请求头信息
     * @param url
     * @param map
     * @return
     * @throws IOException
     */
    public static CloseableHttpResponse doGet(String url, HashMap<String,String> map) throws IOException {
        HttpGet get = new HttpGet(url);

        //加载请求头的httpGet对象
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry:entrySet){
            get.addHeader(entry.getKey(),entry.getValue());
        }

        CloseableHttpResponse response = HttpClients.createDefault().execute(get);
        return response;
    }

    public static CloseableHttpResponse doPost(String url,HashMap<String,String> map) throws IOException {
        HttpPost post = new HttpPost(url);

        //当需要请求头时
        post.setHeader("Accept","application/json");

        //请求体中参数
        //参数格式：{"name": "morpheus", "job": "leader" }
        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        nameValuePairs.add(new BasicNameValuePair("name","morpheus"));
        nameValuePairs.add(new BasicNameValuePair("job","leader"));
        HttpEntity entity = new UrlEncodedFormEntity(nameValuePairs);
        post.setEntity(entity);

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(post);
        return response;
    }

    /**
     * post请求优化写法
     * @param url
     * @param map
     * @return
     * @throws IOException
     */
    public static String doPost2(String url, HashMap<String,String> map) throws IOException {
        HttpPost post = new HttpPost(url);

        //当需要请求头时
        //post.setHeader("Accept","application/json");

        //请求体中参数
        //参数格式：{"name": "morpheus", "job": "leader" }
        List<NameValuePair> pairs = new ArrayList<NameValuePair>();
        Set<String> keySet = map.keySet();
        for (String key:keySet){
            //每个键值对包装成名值对
            pairs.add(new BasicNameValuePair(key,map.get(key)));
        }
        //将参数设置到请求体
        post.setEntity(new UrlEncodedFormEntity(pairs));

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(post);
        HttpEntity entity = response.getEntity();
        String string = EntityUtils.toString(entity);
        return string;
    }

}
