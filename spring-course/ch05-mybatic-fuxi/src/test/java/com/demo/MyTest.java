package com.demo;

import com.demo.dao.StudentDao;
import com.demo.domain.Student;
import com.demo.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/29
 **/

public class MyTest {
    @Test
    public void test(){
        SqlSession session = SqlSessionUtil.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<Student> students = dao.selectStudents();
        for (Student student:students){
            System.out.println(student);
        }
    }
}
