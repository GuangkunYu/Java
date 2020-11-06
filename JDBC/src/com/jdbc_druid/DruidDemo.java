package com.jdbc_druid;

/*
    开源连接池Druid的使用
 */

import com.alibaba.druid.pool.DruidDataSource;
import com.jdbc_utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DruidDemo {
    @Test
    public void demo() {
        Connection conn = null;
        PreparedStatement ptmt = null;
        ResultSet rs = null;

        try {
//            conn = JDBCUtils.getConnection();

            // 使用连接池
            DruidDataSource dataSource = new DruidDataSource();
            // 手动设置数据库连接的参数
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql:///jdbc");
            dataSource.setUsername("root");
            dataSource.setPassword("12345678");

            // 获得连接
            conn = dataSource.getConnection();

            String sql = "select * from account";
            ptmt = conn.prepareStatement(sql);
            rs = ptmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getDouble("money"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, ptmt, conn);
        }
    }
}
