package com.demo.dao.impl;

import com.demo.dao.StudentDao;
import com.demo.domain.Student;
import com.demo.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/18
 **/

public class StudentDaoImpl implements StudentDao {
    @Override
    public Student getById(Integer id) {
        SqlSession session = SqlSessionUtil.getSession();
        Student s = session.selectOne("test.getOneById",id);
        return s;
    }

    @Override
    public void save(Student s) {
        SqlSession session = SqlSessionUtil.getSession();
        session.insert("test.save",s);
    }
}
