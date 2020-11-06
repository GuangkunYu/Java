package com.jdbc_crud;

/*
    JDBC的CRUD操作
 */

import org.junit.Test;

import java.sql.*;

public class CRUDDemo_01 {
    // 查询1条记录代码操作
    @Test
    public void search_02(){
        Connection con = null;
        Statement stmt = null;
        ResultSet set = null;
        try {
            // 创建连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345678");
            // 执行操作：
            // 创建执行SQL语句的对象
            stmt = con.createStatement();
            // 编写SQL语句
            String sql = "select * from user_01 where id = 4";
            set = stmt.executeQuery(sql);
            if (set.next()){
                System.out.print(set.getInt("id") + "  ");
                System.out.print(set.getString("username") + "  ");
                System.out.print(set.getString("password") + "  ");
                System.out.print(set.getString("nickname") + "  ");
                System.out.print(set.getInt("age"));
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                con = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
            }
        }
    }


    // 查询多条记录代码操作
    @Test
    public void search_01(){
        Connection con = null;
        Statement stmt = null;
        ResultSet set = null;
        try {
            // 创建连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345678");
            // 执行操作：
            // 创建执行SQL语句的对象
            stmt = con.createStatement();
            // 编写SQL语句
            String sql = "select * from user_01";
            set = stmt.executeQuery(sql);
            while (set.next()){
                System.out.print(set.getInt("id") + "  ");
                System.out.print(set.getString("username") + "  ");
                System.out.print(set.getString("password") + "  ");
                System.out.print(set.getString("nickname") + "  ");
                System.out.print(set.getInt("age"));
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                con = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
            }
        }
    }


    // 删除代码操作
    @Test
    public void delete(){
        Connection con = null;
        Statement stmt = null;
        try {
            // 创建连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345678");
            // 执行操作：
            // 创建执行SQL语句的对象
            stmt = con.createStatement();
            // 编写SQL语句
            String sql = "delete from user_01 where id = 3";
            int num = stmt.executeUpdate(sql);
            if (num > 0) {
                System.out.println("删除用户成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                con = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
            }
        }
    }


    // 修改代码操作
    @Test
    public void update(){
        Connection con = null;
        Statement stmt = null;
        try {
            // 创建连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345678");
            // 执行操作：
            // 创建执行SQL语句的对象
            stmt = con.createStatement();
            // 编写SQL语句
            String sql = "update user_01 set password='abc', nickname='旺财' where id=4";
            int num = stmt.executeUpdate(sql);
            if (num > 0) {
                System.out.println("修改用户成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                con = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
            }
        }
    }


    // 保存操作的代码实现
    @Test
    public void save() {
        Connection con = null;
        Statement stmt = null;
        try {
            // 创建连接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            // 执行操作：
            // 创建执行SQL语句的对象
            stmt = con.createStatement();
            // 编写SQL语句
            String sql = "insert into user_01 values (null, 'eee', '123', '阿黄', 21)";
            int num = stmt.executeUpdate(sql);
            if (num > 0) {
                System.out.println("保存用户成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                con = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
            }
        }
    }
}
