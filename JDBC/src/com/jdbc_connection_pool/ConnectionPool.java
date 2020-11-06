package com.jdbc_connection_pool;

/*
    连接池的概述：
        什么是连接池：
            连接池是创建和管理一个连接的缓冲池的技术，这些连接准备好被任何需要他们的线程使用
            连接池是装有连接的容器，使用连接的话，可以从连接池中进行获取，使用完成之后将连接归还给连接池
        为什么要学习连接池：
            连接对象创建和销毁时需要耗费时间的，在服务器初始化的时候就初始化一些连接，把这些连接放入到内存
            中，使用的时候可以从内存中获取，使用完之后将连接放入连接池中，从内存中获取和归还的效率要远远高
            于创建和销毁的效率。（可以提升性能）
        连接池原理

    自定义连接池：
        实现步骤：
            编写一个类实现DataSource接口
            重写getConnection方法
            初始化多个连接在内存中
            编写归还连接的方法

    自定义连接池的问题及解决分析：
        问题：
            使用接口的实现类完成的构造，这种写法不方便程序的扩展
            额外提供了方法归还连接，这种方式增加了使用连接池的用户的难度
        解决：
            如果不提供自定义的方法就可以解决这个问题，但是连接要如何归还到连接池呢？
            解决分析的思路：
                在Connection中有一个close方法，close方法完成了连接的销毁。将原有的连接close方法改为归还
                （增强类中的方法）：
                    1：采用继承的方式
                    2：采用装饰者模式
                        使用条件：
                            增强的类和被增强的类实现相同的接口
                            在增强的类中获得被增强类的引用
                    3：动态代理的方式
 */

import com.jdbc_utils.JDBCUtils;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Logger;

public class ConnectionPool implements DataSource {
    ArrayList<Connection> connList = new ArrayList<>();

    // 在初始化的时候提供一些连接
    public ConnectionPool(){
        // 初始化连接
        for (int i=1; i<=3; i++){
            // 向集合中存入连接
            connList.add(JDBCUtils.getConnection());
        }
    }

    // 从连接池中或得连接的方法
    @Override
    public Connection getConnection() throws SQLException {
        Connection conn = connList.remove(0);
        return conn;
    }

    // 编写一个归还连接的方法
    public void addBack(Connection conn){
        connList.add(conn);
    }

    @Override
    public Connection getConnection(String s, String s1) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter printWriter) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int i) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public ConnectionBuilder createConnectionBuilder() throws SQLException {
        return null;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public ShardingKeyBuilder createShardingKeyBuilder() throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> aClass) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> aClass) throws SQLException {
        return false;
    }
}
