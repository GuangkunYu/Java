package com.jdbc_utils;

/*
    JDBC工具类改写

 */

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils2 {
    private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();
    private static final String driverClassName;
    private static final String url;
    private static final String username;
    private static final String password;

    static {
        // 方式二：配置文件
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src\\db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        driverClassName = prop.getProperty("driverClassName");
        url = prop.getProperty("url");
        username = prop.getProperty("username");
        password = prop.getProperty("password");

        /*
        方式一：写死
        driverClassName = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/web_jdbc";
        username = "root";
        password = "root";*/
    }

    // 注册驱动的方法
    public static void loadDriver() {
        try {
            Class.forName(driverClassName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 获得连接池
    public static DataSource getDataSource(){
        return dataSource;
    }

    // 获得连接的方法
    public static Connection getConnection() throws SQLException {

        return dataSource.getConnection();
    }

    // 释放资源的方法
    public static void release(Statement stmt, Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn = null;
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

    public static void release(ResultSet rs, Statement stmt, Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn = null;
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            stmt = null;
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs = null;
        }
    }
}
