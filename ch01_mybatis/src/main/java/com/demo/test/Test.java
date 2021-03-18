package com.demo.test;

import com.demo.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
        //参数1：通过命名空间.id值方式定位sql语句
        //参数2：sql语句中传递的参数
//        Student student = session.selectOne("testSelect.getOneById",1);
//        System.out.println(student);

        //查询所有学生操作
        List<Student> students = session.selectList("testSelect.getAll");
        for (Student student:students){
            System.out.println(student);
        }
        //记得关闭
        session.close();
    }

}
