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
 * @Date 2021/3/21
 **/

public class TestSelectUse$order {
    @Test
    public void testSelectUse$order(){
        SqlSession session = SqlSessionUtils.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<Student> students = dao.selectUse$order("id");
        for (Student student:students){
            System.out.println(student);
        }
    }
}