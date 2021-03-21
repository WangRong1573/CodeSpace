package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudents();

    int insertStudent(Student student);

    List<Student> selectMultiParam(@Param("name") String name,
                                   @Param("age") Integer age);

    /**
     * 使用对象传参
     * @param student
     * @return
     */
    List<Student> selectMultiObject(Student student);
}
