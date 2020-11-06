package com.jdbc_loophole;

/*
    原因：
        在变量中存在SQL关键字
            or
            --

    SQL注入漏洞解决：
        需要采用PreparedStatement对象解决SQL注入漏洞
        这个对象将SQL预先进行编译，使用？作为占位符。？所代表的内容是SQL所固定的。再次传入变量（包含SQL关键字）这个时候也不会识别
        这些关键字
 */

import org.junit.Test;

public class LoopholeDemo {
    // SQL注入漏洞的演示
    @Test
    public void demo_01(){
        UserDao userDao = new UserDao();
        // aaa' or '1=1      aaa' --
        boolean flag = userDao.login("aaa", "123");
        if (flag){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
