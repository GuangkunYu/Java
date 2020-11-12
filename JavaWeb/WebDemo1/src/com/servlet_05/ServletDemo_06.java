package com.servlet_05;

/*
    servletconfig中的API:
        获得servlet的初始化参数
        获得servletcontext对象
        获得servlet的名称
 */

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(
        name = "ServletDemo_06",
        urlPatterns = "/ServletDemo_06",
        initParams = {
                @WebInitParam(name = "username", value = "root"),
                @WebInitParam(name = "password", value = "abc")
        })
public class ServletDemo_06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获得初始化参数的API
        // 获得servletconfig对象
        ServletConfig config = this.getServletConfig();
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");
//        System.out.println(username + "    " + password);

        // 2.获得所有初始化参数的名称
        Enumeration<String> names = config.getInitParameterNames();
        while (names.hasMoreElements()){
            String name = names.nextElement();
            String value = config.getInitParameter(name);
            System.out.println(name + "    " + value);
        }

        // 3. 获得servlet的名称
        String servletName = config.getServletName();
        System.out.println(servletName);
    }
}
