package dao.impl;

import com.domain.Student;
import dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/24
 **/

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> selectStudents() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        String sqlId = "dao.StudentDao.selectStudents";
        List<Student> students = sqlSession.selectList(sqlId);
        //关闭
        sqlSession.close();

        return students;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        String sqlId = "dao.StudentDao.insertStudent";
        int nums = sqlSession.insert(sqlId,student);
        //提交事务
        sqlSession.commit();
        sqlSession.close();
        return nums;
    }
}
