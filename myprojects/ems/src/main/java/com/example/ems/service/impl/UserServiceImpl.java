package com.example.ems.service.impl;

import com.example.ems.dao.UserDao;
import com.example.ems.entity.User;
import com.example.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/7/27
 **/

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        user.setStatus("已激活");
        user.setRegisterTime(new Date());
        userDao.add(user);
    }
}
