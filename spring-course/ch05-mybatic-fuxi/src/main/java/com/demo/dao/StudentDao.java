package com.demo.dao;

import com.demo.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudents();
}
