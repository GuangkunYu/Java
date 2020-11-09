package com.jdbc_druid;

/*
    开源连接池Druid的使用
 */

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.jdbc_utils.JDBCUtils;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DruidDemo {
    // 配置文件方式配置
    @Test
    public void demo2(){
        Connection conn = null;
        PreparedStatement ptmt = null;
        ResultSet rs = null;

        try {
//            conn = JDBCUtils.getConnection();

            // 使用连接池
            // 从属性文件中获取
            Properties prop = new Properties();
            prop.load(new FileInputStream("src\\druid.properties"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);


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


    // 手动设置方式
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
