package com.jdbc_affair;

/*
    JDBC的事务环境准备：
        事务的概念：
            事务指的是逻辑上的一组操作，组成这组操作各个逻辑单元要么全都成功，要么全都失败
        事务环境准备：
            创建数据库和表

    JDBC的事务管理：
        转账案例代码实现
        在转账中添加事务管理：
            事务管理的API：
                void	setAutoCommit​(boolean autoCommit)
                    将此连接的自动提交模式设置为给定状态
                void	commit()
                    使自上次提交/回滚以来所做的所有更改成为永久更改，并释放此 Connection对象当前持有
                    的所有数据库锁。
                void	rollback()
                    撤消当前事务中所做的所有更改，并释放此 Connection对象当前持有的所有数据库锁
 */

import com.jdbc_utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AffairDemo {
    // 添加事务
    @Test
    public void demo02(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // 获得连接
            conn = JDBCUtils.getConnection();
            // 开启事务
            conn.setAutoCommit(false);
            // 编写SQL语句
            String sql = "update account set money = money + ? where name = ?";
            // 预编译SQL
            pstmt = conn.prepareStatement(sql);
            // 设置参数：
            // 用aaa账户给bbb账号转1000元
            pstmt.setDouble(1, -1000);
            pstmt.setString(2, "aaa");
            pstmt.executeUpdate();

//            int i = 1/0;

            // 执行SQL：扣除aaa账号1000元
            pstmt.setDouble(1, 1000);
            pstmt.setString(2,"bbb");
            pstmt.executeUpdate();

            // 提交事务
            conn.commit();
        }catch (Exception e){
            // 事务回滚
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.release(pstmt, conn);
        }
    }


    // 完成转账案例,无事务管理，会出现aaa账号的钱被转丢了，bbb账号的钱没有任何变化
    // 扣除某个账号的钱
    // 给另外一个账号加钱
    @Test
    public void demo01(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // 获得连接
            conn = JDBCUtils.getConnection();
            // 编写SQL语句
            String sql = "update account set money = money + ? where name = ?";
            // 预编译SQL
            pstmt = conn.prepareStatement(sql);
            // 设置参数：
            // 用aaa账户给bbb账号转1000元
            pstmt.setDouble(1, -1000);
            pstmt.setString(2, "aaa");
            pstmt.executeUpdate();

//            int i = 1/0;

            // 执行SQL：扣除aaa账号1000元
            pstmt.setDouble(1, 1000);
            pstmt.setString(2,"bbb");
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(pstmt, conn);
        }
    }
}
