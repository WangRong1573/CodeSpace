package com.bjpowernode.dao;

import com.bjpowernode.domain.MyStudent;
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

    /**
     * 传参方式3：按照位置方式使用 #{arg0} #{arg1}
     * @param name
     * @param age
     * @return
     */
    List<Student> selectMultiPosition(String name,Integer age);


    List<Student> selectUse$order(@Param("cloName") String name);

    List<MyStudent> selectMyStudents();

    List<Student> selectLikeOne(String name);

    List<Student> selectLikeTwo(String name);

    List<Student> selectIf(Student student);
}
