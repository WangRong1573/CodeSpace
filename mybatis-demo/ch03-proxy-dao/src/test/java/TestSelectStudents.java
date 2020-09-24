import com.mybatis.dao.StudentDao;
import com.mybatis.domain.Student;
import com.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/24
 **/

public class TestSelectStudents {

    @Test
    public void testSelectStudents(){
        /**
         * 利用mybatis的动态代理机制，使用SqlSession.getMapper(dao接口)
         * getMapper()能够获取dao接口对应的实现类对象
         */
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectStudents();

        for (Student stu:students){
            System.out.println("学生="+stu);
        }
    }
}
