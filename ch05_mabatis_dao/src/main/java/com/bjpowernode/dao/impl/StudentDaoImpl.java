package com.bjpowernode.dao.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/21
 **/

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudents() {
        SqlSession session = SqlSessionUtils.getSession();
        List<Student> students  = session.selectList("com.bjpowernode.dao.StudentDao.selectStudents");
        session.close();
        return students;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession session = SqlSessionUtils.getSession();
        int num = session.insert("com.bjpowernode.dao.StudentDao.insertStudent", student);
        //注意手动提交事务
        session.commit();
        session.close();
        return num;
    }
}
