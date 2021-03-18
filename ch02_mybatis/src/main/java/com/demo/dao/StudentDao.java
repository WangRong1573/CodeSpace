package com.demo.dao;

import com.demo.domain.Student;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/18
 **/

public interface StudentDao {
    /*
    根据id查询单条记录
     */
    Student getById(Integer id);

    void save(Student s);

}
