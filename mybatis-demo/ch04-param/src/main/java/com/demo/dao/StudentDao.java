package com.demo.dao;

import com.demo.entity.MyStudent;
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

    Map<Object,Object> selectMapById(Integer id);

    /**
     * 使用resultMap
     *      结果映射：指定列名和java对象的属性映射关系
     *      1）自定义列值赋值给哪个属性
     *      2）当列名和对象的属性名称不一致时，一定要使用resultMap来指定映射关系
     * @return
     */
    List<Student> selectAllStudent();


    List<MyStudent> selectMyStudent();

    List<MyStudent> selectMyStudent2();
}
