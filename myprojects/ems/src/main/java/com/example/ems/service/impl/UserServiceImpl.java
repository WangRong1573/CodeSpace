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
        //在用户注册之前先校验用户名是否已经存在
        if (userDao.findByUserName(user.getUsername()) != null){
            throw new RuntimeException("用户名已存在");
        }
        user.setStatus("已激活");
        user.setRegisterTime(new Date());
        userDao.add(user);
    }

    @Override
    public User login(User user) {
        //根据用户输入用户名查询
        User userDB = userDao.findByUserName(user.getUsername());
        if (userDB == null){
            throw new RuntimeException("用户名不存在");
        }
        if (!userDB.getPassword().equals(user.getPassword())){
            throw new RuntimeException("密码错误");
        }
        return userDB;
    }
}
