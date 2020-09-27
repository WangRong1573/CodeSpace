import com.demo.dao.StudentDao;
import com.demo.entity.ViewStudent;
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

public class TestSelectViewStudentById {

    @Test
    public void testSelectViewStudentById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<ViewStudent> viewStudents = dao.selectViewStudentById(20);

        for (ViewStudent stu:viewStudents){
            System.out.println(stu);
        }

        sqlSession.close();
    }
}
