package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.service.TestRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/24
 **/

@Service
public class TestRedisServiceImpl implements TestRedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void put(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
    }
}
