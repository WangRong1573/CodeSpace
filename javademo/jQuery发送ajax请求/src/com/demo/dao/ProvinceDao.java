package com.demo.dao;

import com.demo.entity.Province;
import com.demo.util.JDBCUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/13
 **/

public class ProvinceDao {
    private JDBCUtil util = new JDBCUtil();
    String sql = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public Province getProvinceById(Integer id){
        sql = "select * from province where id = ?";
        ps = util.getPre(sql);
        Province p = null;
        try {
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if (rs.next()){
                String name = rs.getString("name");
                String jiancheng = rs.getString("jiancheng");
                String shenghui = rs.getString("shenghui");
                p = new Province(id,name,jiancheng,shenghui);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close(rs);
        }
        return p;
    }
}
