package com.servlet_05;

/*
    servletcontext对象：
        servlet的上下文对象
        作用：
            用来获取web项目信息
            读取web项目下的文件
 */

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(
        name = "ServletDemo_07",
        urlPatterns = "/ServletDemo_07",
        initParams = {
                @WebInitParam(name = "username", value = "root"),
                @WebInitParam(name = "password", value = "abc")
        }
)
public class ServletDemo_07 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取文件的MIME的类型
        ServletContext servletContext = this.getServletContext();
        String mimeType = servletContext.getMimeType("aa.txt");
        System.out.println(mimeType);

        // 获取web项目请求工程名
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);

        // 获取web项目的全局初始化参数
        String name = servletContext.getInitParameter("username");
        String password = servletContext.getInitParameter("password");
        System.out.println(name + "    " + password);
        System.out.println("------------------");

        Enumeration<String> names = servletContext.getInitParameterNames();
        while (names.hasMoreElements()) {
            String name1 = names.nextElement();
            String value = servletContext.getInitParameter(name1);
            System.out.println(name1 + "   " + value);
        }

    }
}
