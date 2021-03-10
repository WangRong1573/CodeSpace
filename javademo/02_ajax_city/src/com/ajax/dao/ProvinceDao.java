package com.ajax.dao;

import com.ajax.entity.Province;
import com.ajax.util.JDBCUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/10
 **/

public class ProvinceDao {
    private JDBCUtil util = new JDBCUtil();
    String sql = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public Province getProvinceInfoById(Integer id){
        sql = "select name,jiancheng,shenghui from province where id = ?";
        ps = util.getPre(sql);
        Province province = null;
        try {
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if (rs.next()){
                String name = rs.getString("name");
                String jiancheng = rs.getString("jiancheng");
                String shenghui = rs.getString("shenghui");
                province = new Province(id, name, jiancheng, shenghui);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close(rs);
        }
        return province;
    }
}
