package com.jdbc_loophole;

/*
    用户登录功能
 */

import com.jdbc_utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {
    // 用户登录修改版
    public boolean login(String username, String password) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        boolean flag = false;

        try {
            // 获得连接
            conn = JDBCUtils.getConnection();
            // 编写SQL语句
            String sql = "select * from user_01 where username = ? and password = ?";
            // 预编译SQL
            pstmt = conn.prepareStatement(sql);
            // 设置参数
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            // 执行SQL
            rs = pstmt.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, pstmt, conn);
        }
        return flag;
    }


    /*// 用户登录方法
    public boolean login(String username, String password) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        boolean flag = false;

        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();

            String sql = "select * from user_01 where username ='" + username + "' and password ='" + password + "'";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stmt, conn);
        }
        return flag;
    }*/
}
