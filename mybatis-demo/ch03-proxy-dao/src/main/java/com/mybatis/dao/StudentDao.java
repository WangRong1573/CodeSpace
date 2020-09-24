package com.mybatis.dao;

import com.mybatis.domain.Student;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/24
 **/

public interface StudentDao {

    List<Student> selectStudents();

    int insertStudents(Student student);
}
