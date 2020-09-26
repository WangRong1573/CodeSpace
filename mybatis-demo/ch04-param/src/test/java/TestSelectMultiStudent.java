import com.demo.dao.StudentDao;
import com.demo.entity.Student;
import com.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/26
 **/

public class TestSelectMultiStudent {
    @Test
    public void testSelectMultiStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("张三");
        student.setAge(28);
        List<Student> students = dao.selectMultiObject(student);

        for (Student stu:students){
            System.out.println("学生="+stu);
        }

        sqlSession.close();
    }
}
