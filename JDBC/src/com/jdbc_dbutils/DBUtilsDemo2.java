package com.jdbc_dbutils;

/*
    ResultSetHandler的实现类
 */

import com.jdbc_utils.JDBCUtils2;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DBUtilsDemo2 {
    // ArrayHandler：将一条记录封装到一个Object数组中
    @Test
    public void demo_01() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        Object[] objs = queryRunner.query("select * from account where id = ?",
                new ArrayHandler(), 1);
        System.out.println(Arrays.toString(objs));
    }

    // ArrayListHandler：将多条记录封装到一个装有object数组的list集合中
    @Test
    public void demo_02() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        List<Object[]> list = queryRunner.query("select * from account", new ArrayListHandler());
        for (Object[] objs:list){
            System.out.println(Arrays.toString(objs));
        }
    }

    // BeanHandler：将一条记录封装到一个JavaBean中
    @Test
    public void demo_03() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        Account acc = queryRunner.query("select * from account where id = ?",
                new BeanHandler<>(Account.class), 3);
        System.out.println(acc);
    }

    // BeanListHandler：将多条记录封装到一个装有JavaBean的List集合中
    @Test
    public void demo_04() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        List<Account> list = queryRunner.query("select * from account",
                new BeanListHandler<>(Account.class));
        for (Account acc:list){
            System.out.println(acc);
        }
    }

    // MapHandler：将一条记录封装到一个Map集合中，Map的key是列名，Map的value就是表中列的记录值
    @Test
    public void demo_05() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        Map<String, Object> map = queryRunner.query("select * from account where id = ?",
                new MapHandler(), 4);
        System.out.println(map);
    }

    // MapListHandler: 将多条记录封装到一个装有Map的List集合中
    @Test
    public void demo_06() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        List<Map<String, Object>> mapList = queryRunner.query("select * from account",
                new MapListHandler());
        for (Map<String, Object> map:mapList){
            System.out.println(map);
        }
    }

    // ColumnListHandler:将某列的值封装到List集合中
    @Test
    public void demo_07() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        List<Object> list = queryRunner.query("select name,money from account",
                new ColumnListHandler<>("name"));
        for (Object obj:list){
            System.out.println(obj);
        }
    }

    // ScalarHandler:单值封装
    @Test
    public void demo_08() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        Object scal = queryRunner.query("select count(*) from account",
                new ScalarHandler<>());
        System.out.println(scal);
    }

    // KeyedHandler:将一条记录封装到一个Map中，将多个Map装到一个新的包含Map的Map集合中，外面的key是可以指定的
    @Test
    public void demo_09() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
        Map<Object, Map<String, Object>> maps = queryRunner.query("select * from account",
                new KeyedHandler<>());
        System.out.println(maps);
    }
}
