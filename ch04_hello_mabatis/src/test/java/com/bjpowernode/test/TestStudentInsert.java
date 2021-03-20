package com.bjpowernode.test;

import com.bjpowernode.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/20
 **/

public class TestStudentInsert {
    @Test
    public void testInsert(){
        String resource = "mybatis.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        String sqlId = "com.bjpowernode.dao.StudentDao"+"."+"insertStudent";
        Student student = new Student(null, "python", 33);
        int count = session.insert(sqlId, student);
        /*
        mybatis默认不是自动提交事务，在insert，update，delete后需要手动提交事务
         */
        session.commit();
        session.close();
        System.out.println(count == 1?"插入成功":"插入失败");
    }
}
