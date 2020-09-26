
import com.demo.dao.StudentDao;
import com.demo.entity.Student;
import com.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/26
 **/

public class TestSelectStudentById {

    @Test
    public void testSelectStudentById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student student = dao.selectStudentById(102);

        System.out.println(student);
    }
}
