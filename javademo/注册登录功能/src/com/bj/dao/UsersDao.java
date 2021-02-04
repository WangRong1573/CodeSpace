package com.bj.dao;

import com.bj.entity.Users;
import com.bj.util.JDBCUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/2/4
 **/

public class UsersDao {
    private JDBCUtil util = new JDBCUtil();

    public int add(Users user){
        String sql = "insert into Users(userName,password,sex,email) values(?,?,?,?)";
        int result = 0;

        try {
            PreparedStatement ps = util.creatPre(sql);
            ps.setString(1,user.getUserName());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getSex());
            ps.setString(4,user.getEmail());

            result = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close();
        }
        return result;
    }
}
