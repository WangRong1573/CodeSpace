package com.example.ems.dao;

import com.example.ems.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    void add(User user);
}
