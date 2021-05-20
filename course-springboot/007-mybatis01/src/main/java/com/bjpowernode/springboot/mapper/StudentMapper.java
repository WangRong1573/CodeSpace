package com.bjpowernode.springboot.mapper;

import com.bjpowernode.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    Student queryStudentById(Integer id);
}
