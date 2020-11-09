package com.jdbc_c3p0;

/*

 */

import com.jdbc_utils.JDBCUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C3P0Demo {
    // 配置文件设置参数
    @Test
    public void demo2(){
        Connection conn = null;
        PreparedStatement ptmt = null;
        ResultSet rs = null;
        try {
            // 获得连接：从连接池中获得
            // 创建连接池:创建连接池默认去类路径下查找c3p0-config.xml
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            // 设置连接参数
            // 从连接池中获得连接
            conn = dataSource.getConnection();
            // 编写SQL语句
            String sql = "select * from account";
            // 预编译SQL
            ptmt = conn.prepareStatement(sql);
            // 执行SQL
            rs = ptmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("id") + "  " + rs.getString("name") + "  " + rs.getDouble("money"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs, ptmt, conn);
        }
    }

    // 手动设置参数的方式
    @Test
    public void demo1(){
        Connection conn = null;
        PreparedStatement ptmt = null;
        ResultSet rs = null;
        try {
            // 获得连接：从连接池中获得
            // 创建连接池
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            // 设置连接参数
            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql:///jdbc");
            dataSource.setUser("root");
            dataSource.setPassword("12345678");
            // 从连接池中获得连接
            conn = dataSource.getConnection();
            // 编写SQL语句
            String sql = "select * from account";
            // 预编译SQL
            ptmt = conn.prepareStatement(sql);
            // 执行SQL
            rs = ptmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("id") + "  " + rs.getString("name") + "  " + rs.getDouble("money"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs, ptmt, conn);
        }
    }

}
