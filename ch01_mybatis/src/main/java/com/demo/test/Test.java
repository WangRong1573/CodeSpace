package com.demo.test;

import com.demo.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/18
 **/

public class Test {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;

        {
            try {
                inputStream = Resources.getResourceAsStream(resource);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        Student student = session.selectOne("testSelect.getOneById",1);
        System.out.println(student);
    }

}
