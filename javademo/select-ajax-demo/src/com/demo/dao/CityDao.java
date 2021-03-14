package com.demo.dao;

import com.demo.entity.City;
import com.demo.util.JDBCUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/14
 **/

public class CityDao {
    private JDBCUtil util = new JDBCUtil();
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    public ArrayList<City> getCityById(Integer pid){
        sql = "select * from city where provinceid = ?";
        ps = util.getPre(sql);
        City city = null;
        ArrayList<City> cities = new ArrayList<>();
        try {
            ps.setInt(1,pid);
            rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                city = new City(id,name,pid);
                cities.add(city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close(rs);
        }
        return cities;
    }
}
