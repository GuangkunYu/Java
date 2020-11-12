package com.servlet_06;

/*
    servletcontext作为域对象API
        存入数据的方法：
        获取数据的方法：
        移除数据的方法：
    作为域对象的作用范围：
        servletcontext是在服务器启动的时候为每个web项目单独创建一个servletcontext对象，当web项目从服务器移除或关闭服务器的时候，
        servletcontext对象被销毁
        范围：整个的web应用
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletDemo_09", urlPatterns = "/ServletDemo_09")
public class ServletDemo_09 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        // 这个servlet被创建的时候初始化一个值
        this.getServletContext().setAttribute("name", "张三");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object name = this.getServletContext().getAttribute("name");
        System.out.println(name);
    }
}
