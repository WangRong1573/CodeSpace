import com.mybatis.dao.StudentDao;
import com.mybatis.domain.Student;
import com.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/24
 **/

public class TestInsertStudents {

    @Test
    public void testInsertStudents(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        student.setId(102);
        student.setName("诸葛亮");
        student.setEmail("kongming@163.com");
        student.setAge(16);

        int nums = dao.insertStudents(student);

        //提交事务！！提交事务！！提交事务！！！
        sqlSession.commit();

        System.out.println("插入"+nums+"条数据");

        Assert.assertEquals(1,nums);
    }
}
