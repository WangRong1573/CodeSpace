package com.study.elesys.dao;

import com.study.elesys.JDBCUtil;
import com.study.elesys.entity.Dept;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:Dao的封装 DataBase  Access Object
 * @Author rong.wang
 * @Date 2021/1/28
 **/

public class DeptDao {
    private int result = 0;
    private JDBCUtil util = new JDBCUtil();
    private String sql = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private List<Dept> deptList = new ArrayList<>();

    /**
     * 向dept表中添加数据
     *
     * @param deptNo 部门编号
     * @param dName  部门名称
     * @param loc    部门地址
     * @return
     */
    public int add(String deptNo, String dName, String loc) {

        sql = "insert into dept values(?,?,?)";

        try {
            ps = util.creatPre(sql);
            ps.setInt(1, Integer.parseInt(deptNo));
            ps.setString(2, dName);
            ps.setString(3, loc);

            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    /**
     * 根据部门编号删除数据
     *
     * @param deptNo 部门编号
     * @return 执行成功数
     */
    public int delete(String deptNo) {
        sql = "delete from dept where deptno=?";
        try {
            ps = util.creatPre(sql);

            ps.setInt(1, Integer.parseInt(deptNo));

            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    /**
     * 根据部门编号更新数据
     *
     * @param deptNo
     * @param dName
     * @param loc
     * @return
     */
    public int update(String deptNo, String dName, String loc) {
        sql = "update dept set dname=?,loc=? where deptno=?";
        try {
            ps = util.creatPre(sql);
            ps.setString(1, dName);
            ps.setString(2, loc);
            ps.setInt(3, Integer.parseInt(deptNo));

            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    /**
     * 查询
     * @return
     */
    public List<Dept> findAll(){
        sql = "select * from dept";
        try {
            ps = util.creatPre(sql);

            rs = ps.executeQuery();
            while (rs.next()){
                int deptno = rs.getInt("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");

                Dept dept = new Dept(deptno, dname, loc);

                deptList.add(dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.close(rs);
        }
        return deptList;
    }
}
