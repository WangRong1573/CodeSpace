package com.demo.dao;

import com.demo.entity.Province;
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

public class ProvinceDao {
    private JDBCUtil util = new JDBCUtil();
    private String sql = null;
    private PreparedStatement ps;
    private ResultSet rs;


    public ArrayList<Province> getProvince(){
        sql = "select * from province";
        ps = util.getPre(sql);
        Province province=null;
        ArrayList<Province> provinces = new ArrayList<>();
        try {
            rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String jiancheng = rs.getString("jiancheng");
                String shenghui = rs.getString("shenghui");
                 province= new Province(id, name, jiancheng, shenghui);
                 provinces.add(province);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close(rs);
        }
        return provinces;
    }
}
