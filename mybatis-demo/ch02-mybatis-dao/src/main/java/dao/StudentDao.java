package dao;

import com.domain.Student;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/24
 **/

public interface StudentDao {

    /**
     * 查询
     * @return
     */
    List<Student> selectStudents();

    /**
     * 添加
     * @param student
     * @return  影响数据库的行数
     */
    int insertStudent(Student student);
}
