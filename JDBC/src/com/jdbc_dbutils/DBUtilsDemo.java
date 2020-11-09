package com.jdbc_dbutils;

/*
    DBUtils中的API：
        QueryRunner
            核心运行类
        DbUtils
            事务相关类
 */

import com.jdbc_utils.JDBCUtils2;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtilsDemo {
    // 添加操作
    @Test
    public void demo_01() throws SQLException {
        // 创建核心类QueryRunner
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        queryRunner.update("insert into account values(null, ?, ?)",
                "ddd", 10000);
    }

    // 修改操作
    @Test
    public void demo_02() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        queryRunner.update("update account set name=?,money=? where id=1",
                "eee", 20000);
    }

    // 删除操作
    @Test
    public void demo_03() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        queryRunner.update("delete from account where id=?", 2);
    }

    // 查询一条记录的操作
    @Test
    public void demo_04() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        // 执行查询
        Account account = queryRunner.query("select * from account where id = ?", new ResultSetHandler<Account>() {
            @Override
            public Account handle(ResultSet rs) throws SQLException {
                Account account = new Account();
                while (rs.next()){
                    account.setId(rs.getInt("id"));
                    account.setName(rs.getString("name"));
                    account.setMoney(rs.getDouble("money"));
                }
                return account;
            }
        }, 1);
        System.out.println(account);
    }

    // 查询多条记录的操作
    @Test
    public void demo_05() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        // 执行查询
        List<Account> list = queryRunner.query("select * from account", new ResultSetHandler<List<Account>>() {
            @Override
            public List<Account> handle(ResultSet rs) throws SQLException {
                // 创建一个集合用于封装数据
                List<Account> list = new ArrayList<>();
                while (rs.next()){
                    // 将结果集中的数据封装到对象中
                    Account account = new Account();
                    account.setId(rs.getInt("id"));
                    account.setName(rs.getString("name"));
                    account.setMoney(rs.getDouble("money"));
                    // 将对象存入list集合
                    list.add(account);
                }
                return list;
            }
        });
        // 使用集合
        for (Account acc:list){
            System.out.println(acc);
        }

    }
}
