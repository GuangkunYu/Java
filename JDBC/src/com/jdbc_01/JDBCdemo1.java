package com.jdbc_01;

import org.junit.Test;

import java.sql.*;

/*
    JDBC入门程序
 */

public class JDBCdemo1 {
    @Test
    public void demo1() throws ClassNotFoundException, SQLException {
        // 1.加载驱动
        //Class.forName("com.mysql.jdbc.Driver");

        // 2.获得连接 ?serverTimezone=Asia/Shanghai
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",
                "root",
                "root");

        // 3.基本操作:执行SQL语句
        // 3.1 获得执行SQL语句的对象
        Statement statement = con.createStatement();
        // 3.2 编写SQL语句
        String sql = "select * from user_01";
        // 3.3 执行SQL
        ResultSet rs = statement.executeQuery(sql);
        // 3.3 遍历结果集
        while (rs.next()){
            System.out.print(rs.getInt("id") + "  ");
            System.out.print(rs.getString("username")  + "  ");
            System.out.print(rs.getString("password") + "  ");
            System.out.print(rs.getString("nickname") + "  ");
            System.out.print(rs.getInt("age"));
            System.out.println();
        }

        // 4.释放资源
        rs.close();
        statement.close();
        con.close();

    }
}
