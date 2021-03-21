package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
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
        SqlSession session = SqlSessionUtils.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student = new Student(null, "why", 4);
        int num = dao.insertStudent(student);
        session.commit();
        System.out.println("影响数据库条数："+num);
    }
}
