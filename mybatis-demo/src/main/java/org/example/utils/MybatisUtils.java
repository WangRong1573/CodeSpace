package org.example.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 工具类
 * @Author rong.wang
 * @Date 2020/9/24
 **/

public class MybatisUtils {

    private static SqlSessionFactory sessionFactory = null;
    static {
        //需要和项目中的配置文件一致
        String config = "mybatis.xml";
        try {
            InputStream in = Resources.getResourceAsStream(config);
            //创建SqlSessionFactory 对象
            sessionFactory = new SqlSessionFactoryBuilder().build(in);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        SqlSession session = null;
        if (sessionFactory != null){
            //非自动提交事务
            session = sessionFactory.openSession();
        }
        return session;
    }
}
