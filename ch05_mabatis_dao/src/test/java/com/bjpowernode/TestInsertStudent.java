package com.bjpowernode;

import com.bjpowernode.dao.impl.StudentDaoImpl;
import com.bjpowernode.domain.Student;
import org.junit.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/21
 **/

public class TestInsertStudent {
    @Test
    public void testInsertStudent(){
        StudentDaoImpl dao = new StudentDaoImpl();
        Student student = new Student(null, "ysw", 35);
        dao.insertStudent(student);
    }
}
