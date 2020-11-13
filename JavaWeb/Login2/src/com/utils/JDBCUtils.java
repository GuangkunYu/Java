package com.utils;

/*
    JDBC工具类改写

 */

import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;
import java.sql.*;

public class JDBCUtils {
    // 创建一个连接池：但是这个连接池只需要创建一次即可
    private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();

    // 获得连接的方法
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    // 获得连接池
    public static DataSource getDataSource(){
        return dataSource;
    }

}
