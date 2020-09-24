import com.domain.Student;
import dao.impl.StudentDaoImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/24
 **/

public class TestMybatis {

    @Test
    public void testSelectStudent(){
        StudentDaoImpl dao = new StudentDaoImpl();
        List<Student> students = dao.selectStudents();
        for (Student student:students){
            System.out.println(student);
        }
    }

    @Test
    public void testInsertStudent(){
        StudentDaoImpl dao = new StudentDaoImpl();
        Student student = new Student();
        student.setId(101);
        student.setName("关云长");
        student.setEmail("guanyu@qq.com");
        student.setAge((int) Math.random());
        int nums = dao.insertStudent(student);
        Assert.assertEquals(1,nums);
    }
}
