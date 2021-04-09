package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentService {
    int add(Student student);

    List<Student> query();
}
