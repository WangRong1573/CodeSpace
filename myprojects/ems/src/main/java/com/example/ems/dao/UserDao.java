package com.example.ems.dao;

import com.example.ems.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    void add(User user);

    /**
     * 根据用户名查询是否已经存在
     * @param username
     * @return
     */
    User findByUserName(String username);

}
