package com.jdbc_connection_pool;

/*
    自定义连接池的测试
 */

import com.jdbc_utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSourceDemo {
    // 测试自定义连接池
    @Test
    public void demo01(){
        ConnectionPool connects = null;
        Connection conn = null;
        PreparedStatement ptmt = null;
        ResultSet rs = null;

        try {
            // 获得连接
//            conn = JDBCUtils.getConnection();
            // 从连接池中获得连接
            connects = new ConnectionPool();
            conn = connects.getConnection();
            // 编写SQL
            String sql = "select * from account";
            // 预编译SQL
            ptmt = conn.prepareStatement(sql);
            // 设置参数

            // 执行SQL
            rs = ptmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("id") + "  " + rs.getString("name") + " " +
                        rs.getDouble("money"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
//            JDBCUtils.release(rs, ptmt, conn);
            if (rs != null){
                try {
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            connects.addBack(conn);
        }
    }
}
