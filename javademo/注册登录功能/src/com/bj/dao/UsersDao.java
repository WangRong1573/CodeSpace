package com.bj.dao;

import com.bj.entity.Users;
import com.bj.util.JDBCUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/2/4
 **/

public class UsersDao {
    private JDBCUtil util = new JDBCUtil();
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private ArrayList<Users> list = new ArrayList<>();

    public int add(Users user){
        String sql = "insert into Users(userName,password,sex,email) values(?,?,?,?)";
        int result = 0;

        try {
            ps = util.creatPre(sql);
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

    public int delete(String userId){
        String sql = "delete from Users where userId=?";
        int result = 0;

        try {
            ps = util.creatPre(sql);
            ps.setInt(1, Integer.parseInt(userId));

            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close();
        }
        return result;
    }

    public ArrayList<Users> showUsers(){
        String sql = "select * from Users";

        try {
            ps = util.creatPre(sql);

            rs = ps.executeQuery();

            while (rs.next()){
                int userId = rs.getInt("userId");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String sex = rs.getString("sex");
                String email = rs.getString("email");

                Users users = new Users(userId, userName, password, sex, email);
                list.add(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close(rs);
        }
        return list;
    }

    public int login(String userName, String password) {
        int result = 0;
        String sql = "select count(*) from users where userName=? and password=?";

        try {
            ps = util.creatPre(sql);
            ps.setString(1,userName);
            ps.setString(2,password);
            rs = ps.executeQuery();
            while (rs.next()){
                result = rs.getInt("count(*)");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close(rs);
        }
        return result;
    }
}
