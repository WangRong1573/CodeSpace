import com.demo.dao.StudentDao;
import com.demo.entity.MyStudent;
import com.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/27
 **/

public class TestSelectAllStudent2 {

    SqlSession sqlSession = null;

    @Test
    public void testSelectAllStudent2() {
        sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<MyStudent> myStudents = dao.selectMyStudent2();

        for (MyStudent stu : myStudents) {
            System.out.println("学生=" + stu);
        }
    }

    @AfterTest
    public void afterTest() {
        sqlSession.close();
    }
}
