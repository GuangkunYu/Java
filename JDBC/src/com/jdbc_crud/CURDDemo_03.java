package com.jdbc_crud;

/*
    JDBC配置信息提取到配置文件
        配置文件：
            属性文件：
                格式：
                    扩展名是.properties
                    内容：key=value
            XML文件

        提取信息到配置文件：
            定义一个配置文件db.properties

        在工具类中解析属性文件：
            获取到具体内容为常量赋值

 */

import com.jdbc_utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CURDDemo_03 {
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
