import com.demo.dao.StudentDao;
import com.demo.utils.MybatisUtils;
import com.demo.vo.QueryStudent;
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

public class TestQueryStudent {

    @Test
    public void queryStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<QueryStudent> queryStudents = dao.queryStudent(102);

        for (QueryStudent stu:queryStudents){
            System.out.println("学生="+stu);
        }

        sqlSession.close();
    }
}
