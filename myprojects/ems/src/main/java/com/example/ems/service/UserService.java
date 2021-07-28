package com.example.ems.service;

import com.example.ems.entity.User;

public interface UserService {
    void add(User user);

    /**
     * 用户登录
     * @param user
     * @return
     */
    User login(User user);
}
