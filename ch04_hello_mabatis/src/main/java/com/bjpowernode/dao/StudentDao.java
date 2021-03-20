package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentDao {
    /**
     * 查询所有学生
     * @return 所有学生list
     */
    List<Student> selectStudents();

    /**
     * 插入数据
     * @param student
     * @return 影响数据库行数
     */
    int insertStudent(Student student);
}
