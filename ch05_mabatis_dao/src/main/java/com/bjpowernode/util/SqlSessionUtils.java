package com.bjpowernode.util;

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
 * @Date 2021/3/21
 **/

public class SqlSessionUtils {
    private static SqlSessionFactory factory;
    static {
        String resource = "mybatis.xml";
        try {
            InputStream stream = Resources.getResourceAsStream(resource);
             factory= new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){
        SqlSession session = null;
        if (factory != null){
            session = factory.openSession();
        }
        return session;
    }
}
