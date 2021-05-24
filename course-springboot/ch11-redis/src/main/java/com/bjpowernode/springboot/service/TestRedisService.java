package com.bjpowernode.springboot.service;

public interface TestRedisService {
    void put(String key, String value);

    String get(String key);
}
