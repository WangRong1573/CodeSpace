package com.bjpowernode;

import com.bjpowernode.dao.impl.StudentDaoImpl;
import com.bjpowernode.domain.Student;
import org.junit.Test;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/21
 **/

public class TestSelectStudents {
    @Test
    public void testSelectStudents(){
        StudentDaoImpl dao = new StudentDaoImpl();
        List<Student> students = dao.selectStudents();
        for (Student student:students){
            System.out.println(student);
        }
    }
}
