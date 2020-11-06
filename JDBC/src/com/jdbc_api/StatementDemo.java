package com.jdbc_api;

/*
    Statement:
        执行静态SQL语句并返回其生成的结果的对象。
        作用：
            1.执行SQL
                boolean	execute​(String sql)    ：执行查询、修改、添加、删除的SQL语句
                    执行给定的SQL语句，该语句可能返回多个结果。
                ResultSet	executeQuery​(String sql)   ：执行查询（select语句）
                    执行给定的SQL语句，该语句返回单个 ResultSet对象。
                int	executeUpdate​(String sql)  ：执行修改、添加、删除的SQL语句
                    执行给定的SQL语句，这可能是 INSERT ， UPDATE ，或 DELETE语句，或者不返回任何内容，
                    如SQL DDL语句的SQL语句。
            2.执行批处理
                void	addBatch​(String sql)
                    将给定的SQL命令添加到此 Statement对象的当前命令列表中
                void	clearBatch()
                    清空此 Statement对象的当前SQL命令列表。
                int[]	executeBatch()
                    将一批命令提交到数据库以供执行，如果所有命令成功执行，则返回一组更新计数
 */

public class StatementDemo {
}
