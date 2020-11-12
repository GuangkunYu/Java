package com.servlet_05;

/*
    web项目中读取文件
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@WebServlet(name = "ServletDemo_08", urlPatterns = "/ServletDemo_08")
public class ServletDemo_08 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 读取web项目下的文件使用servletcontext读取
        Properties prop = new Properties();
//        prop.load(new FileInputStream("src\\db.properties"));
        InputStream resourceAsStream = this.getServletContext().getResourceAsStream("WEB-INF/classes/db.properties");
        prop.load(resourceAsStream);
        // 获取数据
        String className = prop.getProperty("driverClassName");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        System.out.println(className);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);


        /*// 传统方法
        Properties prop = new Properties();
        prop.load(new FileInputStream("src\\db.properties"));
        // 获取数据
        String className = prop.getProperty("driverClassName");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        System.out.println(className);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);*/
    }
}
