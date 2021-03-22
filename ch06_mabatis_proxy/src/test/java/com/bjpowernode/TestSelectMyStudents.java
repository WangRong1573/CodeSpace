package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.MyStudent;
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

public class TestSelectMyStudents {
    @Test
    public void testSelectMyStudents(){
        SqlSession session = SqlSessionUtils.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<MyStudent> myStudents = dao.selectMyStudents();
        for(MyStudent myStudent:myStudents){
            System.out.println(myStudent);
        }
    }
}
