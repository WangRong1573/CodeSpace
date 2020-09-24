package com.mybatis.utils;

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
 * @Date 2020/9/24
 **/

public class MybatisUtils {

    private static SqlSessionFactory factory = null;

    static {
        String config = "mybatis.xml";

        try {
            InputStream inputStream = Resources.getResourceAsStream(config);

            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){

        SqlSession sqlSession = null;

        if (factory != null){
            sqlSession = factory.openSession();
        }


        return sqlSession;
    }
}
