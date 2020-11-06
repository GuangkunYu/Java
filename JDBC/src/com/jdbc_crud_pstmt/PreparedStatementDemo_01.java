package com.jdbc_crud_pstmt;

/*
    JDBC的CRUD的操作：PreparedStatement
 */

import com.jdbc_utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementDemo_01 {
    // 查询操作
    @Test
    public void search(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 获得连接
            conn = JDBCUtils.getConnection();

            // 编写SQL
            String sql = "select * from user_01";
            // 预编译SQL
            pstmt = conn.prepareStatement(sql);
            // 设置值
//            pstmt.setInt(1, 2);
            // 执行SQL
            rs = pstmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("username") + "  " + rs.getString("nickname") + "  "
                + rs.getInt("age"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            JDBCUtils.release(rs, pstmt, conn);
        }
    }

    // 删除操作
    @Test
    public void delete(){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 获得连接
            conn = JDBCUtils.getConnection();

            // 编写SQL
            String sql = "delete from user_01 where id = ?";
            // 预编译SQL
            pstmt = conn.prepareStatement(sql);
            // 设置值
            pstmt.setInt(1, 2);
            // 执行SQL
            int num = pstmt.executeUpdate();
            if (num > 0){
                System.out.println("删除用户成功");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            JDBCUtils.release(pstmt, conn);
        }
    }

    // 修改操作
    @Test
    public void modify(){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 获得连接
            conn = JDBCUtils.getConnection();

            // 编写SQL
            String sql = "update user_01 set username=?, password=?, nickname=?, age=? where id=?";
            // 预编译SQL
            pstmt = conn.prepareStatement(sql);
            // 设置值
            pstmt.setString(1, "fff");
            pstmt.setString(2, "789");
            pstmt.setString(3, "小狗子");
            pstmt.setInt(4, 8);
            pstmt.setInt(5, 1);
            // 执行SQL
            int num = pstmt.executeUpdate();
            if (num > 0){
                System.out.println("修改用户成功");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            JDBCUtils.release(pstmt, conn);
        }
    }

    // 保存操作
    @Test
    public void save(){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 获得连接
            conn = JDBCUtils.getConnection();

            // 编写SQL
            String sql = "insert into user_01 values (null, ?, ?, ?, ?)";
            // 预编译SQL
            pstmt = conn.prepareStatement(sql);
            // 设置值
            pstmt.setString(1, "ccc");
            pstmt.setString(2, "456");
            pstmt.setString(3, "沧源");
            pstmt.setInt(4, 18);

            int num = pstmt.executeUpdate();
            if (num > 0){
                System.out.println("添加用户成功");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            JDBCUtils.release(pstmt, conn);
        }
    }
}
