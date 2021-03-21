package com.bjpowernode.test;

import com.bjpowernode.domain.Student;
import com.bjpowernode.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/21
 **/

public class Test2 {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtils.getSession();
        List<Student> students = session.selectList("com.bjpowernode.dao.StudentDao.selectStudents");
        for (Student student:students){
            System.out.println(student);
        }
    }
}
