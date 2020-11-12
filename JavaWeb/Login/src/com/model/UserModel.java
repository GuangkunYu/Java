package com.model;

/*
    处理数据的Javabean
 */

import com.domain.User;
import com.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

// 处理用户登录的个方法
public class UserModel {

    public UserModel() {
        System.out.println("test");
    }

    public User login(User user) throws SQLException {
        // 连接数据库，通过传入的用户名和密码去数据库中进行查询
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        User exisUser = queryRunner.query("select * from user_02 where username=? and password=?",
                new BeanHandler<>(User.class),
                user.getUsername(), user.getPassword());
        return exisUser;
    }
}
