package com.jdbc_api;

/*
    jdbc的资源释放：
        JDBC程序执行结束后，将与数据库进行交互的对象释放掉，通常是ResultSet,Statement,Connection
        这几个对象中尤其是Connection对象是非常稀有的。这个对象一定要做到尽量晚创建，尽早释放掉
            将资源释放的代码写入到finally的代码块中
            资源释放的代码应该写的标准
 */

import java.sql.*;

public class CloseDemo {
    public static void main(String[] args) {
        Connection con = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            // 2.获得连接 ?serverTimezone=Asia/Shanghai
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",
                    "root",
                    "root");

            // 3.基本操作:执行SQL语句
            // 3.1 获得执行SQL语句的对象
            statement = con.createStatement();
            // 3.2 编写SQL语句
            String sql = "select * from user_01";
            // 3.3 执行SQL
            rs = statement.executeQuery(sql);
            // 3.3 遍历结果集
            while (rs.next()){
                System.out.print(rs.getInt("id") + "  ");
                System.out.print(rs.getString("username")  + "  ");
                System.out.print(rs.getString("password") + "  ");
                System.out.print(rs.getString("nickname") + "  ");
                System.out.print(rs.getInt("age"));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 4.释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                rs = null;
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                statement = null;
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                con = null;
            }
        }
    }
}
