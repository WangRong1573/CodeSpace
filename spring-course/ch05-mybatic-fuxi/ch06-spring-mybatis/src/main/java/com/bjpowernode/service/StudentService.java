package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/29
 **/

public interface StudentService {
    int add(Student student);
    List<Student> queryStudents();
}
