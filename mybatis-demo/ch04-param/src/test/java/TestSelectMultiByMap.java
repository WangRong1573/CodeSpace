import com.demo.dao.StudentDao;
import com.demo.entity.Student;
import com.demo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/26
 **/

public class TestSelectMultiByMap {
    @Test
    public void testSelectMultiByMap(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",69);
        List<Student> students = dao.selectMultiByMap(map);

        for (Student stu:students){
            System.out.println("学生="+stu);
        }

        sqlSession.close();
    }
}
