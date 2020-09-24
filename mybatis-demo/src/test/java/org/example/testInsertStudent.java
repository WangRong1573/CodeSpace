package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Student2;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/16
 **/

public class testInsertStudent {
    public static void main(String[] args) throws IOException {
        String config = "mybatis.xml";

        //2.读取这个config表示的文件
        InputStream in = Resources.getResourceAsStream(config);

        //3.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        //4.创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);

        //5.获取SqlSession对象，从SqlSessionFactory中获取
        SqlSession sqlSession = factory.openSession();

        //6.指定要执行的sql语句的标识，用的sql映射文件的namespace+"."+标签的id值
        String sqlId = "org.example.dao.Student2Dao.insertStudent";

        //执行sql语句，通过sqlId找到
        Student2 student2 = new Student2();
        student2.setId(224);
        student2.setName("李小龙2");
        student2.setEmail("jackli@163.com");
        student2.setAge(40);
        int num = sqlSession.insert(sqlId,student2);

        //mybatis默认是不自动提交事务的
        sqlSession.commit();

        System.out.println("影响"+num+"行");

        System.out.println(num==1 ? "插入成功":"插入失败");

        //关闭sqlSession对象
        sqlSession.close();
    }
}
