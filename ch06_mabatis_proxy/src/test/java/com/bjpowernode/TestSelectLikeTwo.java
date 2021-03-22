package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/22
 **/

public class TestSelectLikeTwo {
    @Test
    public void testSelectLikeTwo(){
        SqlSession session = SqlSessionUtils.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        String name = "h";
        List<Student> students = dao.selectLikeTwo(name);
        for (Student student:students){
            System.out.println(student);
        }
    }
}
