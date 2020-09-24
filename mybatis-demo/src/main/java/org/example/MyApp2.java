package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Student2;
import org.example.utils.MybatisUtils;

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

public class MyApp2 {
    public static void main(String[] args) throws IOException {

        //5.获取SqlSession对象，从SqlSessionFactory中获取
        SqlSession sqlSession = MybatisUtils.getSqlSession();

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
