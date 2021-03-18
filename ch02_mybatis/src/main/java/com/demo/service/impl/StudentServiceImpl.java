package com.demo.service.impl;

import com.demo.dao.StudentDao;
import com.demo.dao.impl.StudentDaoImpl;
import com.demo.domain.Student;
import com.demo.service.StudentService;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/18
 **/

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = new StudentDaoImpl();
    @Override
    public Student getById(Integer id) {
        return null;
    }

    @Override
    public void save(Student s) {

    }
}
