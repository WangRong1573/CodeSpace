package com.demo.dao;

import com.demo.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    Student selectStudentById(Integer id);

    List<Student> selectMultiParam(@Param("myname") String name,
                                   @Param("myage") Integer age);
}
