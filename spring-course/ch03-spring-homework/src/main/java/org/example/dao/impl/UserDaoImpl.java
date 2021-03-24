package org.example.dao.impl;

import org.example.dao.UserDao;
import org.example.domain.User;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/24
 **/

public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser(User user) {
        System.out.println("user插入到数据库");
    }
}
