package com.jdbc_crud;

/*
    JDBC的工具类的抽取：
        注册驱动，获得连接，释放资源这些代码是重复编写的，可以将重复的代码提取到一个类中来完成
    JDBC工具类测试
 */

import com.jdbc_utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CURDDemo_02 {
    @Test
    public void search() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 获取连接
            conn = JDBCUtils.getConnection();
            // 创建执行SQL的对象
            stmt = conn.createStatement();
            // 编写SQL
            String sql = "select * from user_01";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "  " + rs.getString("username") + "  " +
                        rs.getString("password") + "  " + rs.getString("nickname") + "  " +
                        rs.getInt("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stmt, conn);
        }
    }
}
