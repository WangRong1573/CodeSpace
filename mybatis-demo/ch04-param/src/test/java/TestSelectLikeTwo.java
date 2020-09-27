import com.demo.dao.StudentDao;
import com.demo.entity.Student;
import com.demo.utils.MybatisUtils;
import com.sun.security.auth.module.LdapLoginModule;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/27
 **/

public class TestSelectLikeTwo {

    @Test
    public void testSelectLikeTwo(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        String name = "李";
        List<Student> students = dao.selectLikeTwo(name);

        for (Student stu:students){
            System.out.println("学生="+stu);
        }

        sqlSession.close();
    }
}
