package com.jdbc_api;

/*
    Connection:
        与特定数据库的连接对象
        作用：
            1.创建执行SQL语句的对象
                Statement	createStatement()      ： 执行SQL
                    创建一个 Statement对象，用于将SQL语句发送到数据库。
                CallableStatement	prepareCall​(String sql)    ： 执行数据库中的存储过程
                    创建一个用于调用数据库存储过程的 CallableStatement对象
                PreparedStatement	prepareStatement​(String sql)   ： 执行SQL，对SQL进行预处理，解决SQL注入漏洞
                    创建一个 PreparedStatement对象，用于将参数化SQL语句发送到数据库
            2.管理事务
                void	setAutoCommit​(boolean autoCommit)
                    将此连接的自动提交模式设置为给定状态。
                void	commit()
                    使自上次提交/回滚以来所做的所有更改成为永久更改，并释放此 Connection对象当前持有的所有数据库锁。
                void	rollback()
                    撤消当前事务中所做的所有更改，并释放此 Connection对象当前持有的所有数据库锁。
 */

public class ConnectionDemo {
}
