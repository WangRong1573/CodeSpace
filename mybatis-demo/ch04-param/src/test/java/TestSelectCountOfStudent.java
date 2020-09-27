import com.demo.dao.StudentDao;
import com.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/27
 **/

public class TestSelectCountOfStudent {

    @Test
    public void testSelectCountOfStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        int num = dao.selectCountOfStudent();

        System.out.println("总学生数为："+num);
    }
}
