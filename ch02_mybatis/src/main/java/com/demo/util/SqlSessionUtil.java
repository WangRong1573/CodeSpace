package com.demo.util;

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

public class SqlSessionUtil {
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    //保证同一线程下对象唯一，在事务操作时保证连接通道是同一个
    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();

    public static SqlSession getSession(){
        SqlSession session = t.get();
        if (session == null){
            session = sqlSessionFactory.openSession();
            t.set(session);
        }
        return session;
    }

    public void myClose(SqlSession sqlSession){
        if (sqlSession != null) {
            sqlSession.close();

            //这句必须加
            t.remove();
        }
    }

}
