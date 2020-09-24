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
        //dao.StudentDao
        StudentDaoImpl dao = new StudentDaoImpl();
        /**
         * List<Student> students = dao.selectStudents(); 调用
         * 1.dao对象，类型是StudentDao，全限定名称是dao.StudentDao 和studentDao.xml的namespace值是一样的
         *
         * 2.方法名称selectStudents(),与mapper文件studentDao.xml的id是一样的
         *
         * 3.通过dao中的返回值，mybatis可以确定要调用的SqlSession的方法
         *      如果返回值是list，调用的是SqlSession.selectList()方法
         *      如果返回值是int，或者其他类型，非list类型，根据mapper文件中的标签是<insert>,或者<update>
         *       就会调用SqlSession的insert()或者update()方法
         *
         *
         * Mybatis的动态代理：
         *      mybatis根据dao的调用方法，获取执行sql语句的信息，根据dao接口创建出一个dao接口的实现类，并创建这个类的
         *      对象，完成SqlSession调用方法，访问数据库
         */
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
