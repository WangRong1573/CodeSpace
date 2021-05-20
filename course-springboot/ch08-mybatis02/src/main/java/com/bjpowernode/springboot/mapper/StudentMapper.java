package com.bjpowernode.springboot.mapper;

import com.bjpowernode.springboot.model.Student;

public interface StudentMapper {
    Student queryStudentById(Integer id);
}
