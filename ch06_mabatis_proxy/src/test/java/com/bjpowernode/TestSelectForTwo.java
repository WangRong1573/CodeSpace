package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/22
 **/

public class TestSelectForTwo {
    @Test
    public void testSelectForTwo(){
        SqlSession session = SqlSessionUtils.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(2);
        students.add(s1);

        s1 = new Student();
        s1.setId(4);
        students.add(s1);

        s1 = new Student();
        s1.setId(5);
        students.add(s1);

        List<Student> studentList = dao.selectForTwo(students);
        for (Student student:studentList){
            System.out.println(student);
        }
    }
}
