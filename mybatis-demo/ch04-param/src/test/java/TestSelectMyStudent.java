import com.demo.dao.StudentDao;
import com.demo.entity.MyStudent;
import com.demo.utils.MybatisUtils;
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

public class TestSelectMyStudent {

    @Test
    public void testSelectMyStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<MyStudent> myStudents = dao.selectMyStudent();

        for (MyStudent myStu : myStudents) {
            System.out.println("myStu=" + myStu);
        }

        sqlSession.close();
    }
}
