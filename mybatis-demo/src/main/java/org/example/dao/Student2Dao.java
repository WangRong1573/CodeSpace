package org.example.dao;

import org.example.entity.Student2;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 接口操作student2表
 * @Author rong.wang
 * @Date 2020/9/15
 **/

public interface Student2Dao {

    /**
     * 查询student2表中的所有数据
     * @return
     */
    public List<Student2> selectStudents();

    /**
     * student 插入数据库的数据
     * @param student2
     * @return  int 执行insert语句后影响数据库的行数
     */
    public int insertStudent(Student2 student2);
}
