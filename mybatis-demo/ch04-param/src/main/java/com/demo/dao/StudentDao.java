package com.demo.dao;

import com.demo.entity.Student;
import com.demo.entity.ViewStudent;
import com.demo.vo.QueryStudent;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {

    Student selectStudentById(Integer id);

    List<Student> selectMultiParam(@Param("myname") String name,
                                   @Param("myage") Integer age);

    List<Student> selectMultiObject(Student student);

    List<Student> selectMultiPosition(String name,Integer age);

    List<Student> selectMultiByMap(Map<String,Object> map);

    int selectCountOfStudent();

    List<ViewStudent> selectViewStudentById(Integer id);

    List<QueryStudent> queryStudent(Integer id);
}
