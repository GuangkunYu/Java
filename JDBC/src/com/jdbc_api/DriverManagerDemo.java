package com.jdbc_api;

/*
    DriverManager：
       驱动管理类，
       作用：
            1.注册驱动：Driver类中的静态代码块
            2.获得连接：
                static Connection	getConnection​(String url, String user, String password)
                    尝试建立与给定数据库URL的连接。
                    参数：
                        url - 格式为 jdbc:subprotocol:subname的数据库URL
                            jdbc:mysql://localhost:3306/web_jdbc
                        user - 代表其建立连接的数据库用户
                        password - 用户的密码
 */

public class DriverManagerDemo {
}
