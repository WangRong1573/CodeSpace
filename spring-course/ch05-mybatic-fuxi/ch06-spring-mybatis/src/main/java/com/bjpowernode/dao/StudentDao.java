package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentDao {
    int insert(Student student);
    List<Student> selectAll();
}
