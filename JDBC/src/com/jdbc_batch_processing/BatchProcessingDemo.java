package com.jdbc_batch_processing;

/*
    JDBC的批处理操作：
        什么是批处理：
            之前进行jdbc的操作的时候，都是一条SQL语句执行，现在如果使用批处理，可以将一批SQL一起执行
        批处理基本使用：

 */

import com.jdbc_utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BatchProcessingDemo {
    // 批量插入记录
    @Test
    public void demo02(){
        long begin = System.currentTimeMillis();
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // 获得连接
            conn = JDBCUtils.getConnection();

            // 编写SQL
            String sql = "insert into user values (null, ?)";
            // 预编译SQL
            pstmt = conn.prepareStatement(sql);
            for (int i=1; i<=10000; i++){
                pstmt.setString(1, "name" + i);
                // 添加到批处理
                pstmt.addBatch();
                // 注意问题：
                if (i %1000 ==0){
                    // 执行批处理
                    pstmt.executeBatch();
                    // 清空批处理
                    pstmt.clearBatch();
                }
            }

            // 执行批处理
            int[] ls = pstmt.executeBatch();
            System.out.println(ls);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(pstmt, conn);
        }
        long end = System.currentTimeMillis();
        System.out.println((end - begin) / 1000);
    }

    // statement实现批量操作
    @Test
    public void demo01(){
        Connection conn = null;
        Statement stmt = null;
        try {
            // 获得连接
            conn = JDBCUtils.getConnection();
             // 创建执行批处理对象
            stmt = conn.createStatement();

            // 编写SQL
            String sql1 = "create database test1";
            String sql2 = "use test1";
            String sql3 = "create table user(id int primary key auto_increment, name varchar(20))";
            String sql4 = "insert into user values (null, 'aaa')";
            String sql5 = "insert into user values (null, 'bbb')";
            String sql6 = "insert into user values (null, 'ccc')";
            String sql7 = "update user set name = 'dddd' where id = 2";

            // 添加到批处理
            stmt.addBatch(sql1);
            stmt.addBatch(sql2);
            stmt.addBatch(sql3);
            stmt.addBatch(sql4);
            stmt.addBatch(sql5);
            stmt.addBatch(sql6);
            stmt.addBatch(sql7);

            // 执行批处理
            int[] ls = stmt.executeBatch();
            System.out.println(ls);


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(stmt, conn);
        }
    }
}
