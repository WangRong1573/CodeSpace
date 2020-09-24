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
 * @Date 2020/9/15
 **/

public class MyApp {
    public static void main(String[] args) throws IOException {
        //访问mybatis读取student2数据
        //1.定义mybatis主配置文件的名称变量,从类路径的根开始，即target/classes
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
        String sqlId = "org.example.dao.Student2Dao.selectStudents";

        //执行sql语句，通过sqlId找到
        List<Student2> student2s = sqlSession.selectList(sqlId);

        for (Student2 stu:student2s) {
            System.out.println("查询的学生信息="+stu);
        }

        //关闭sqlSession对象
        sqlSession.close();
    }
}
