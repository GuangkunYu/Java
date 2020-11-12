package com.servlet_01;

/*
    Servlet入门程序
 */

import javax.servlet.*;
import java.io.IOException;

public class HelloServlet implements Servlet {
    @Override
    // 用来处理客户的请求，并且对请求作出响应的方法
    public void service(ServletRequest req, ServletResponse rep) throws ServletException, IOException {
        // 向页面输出一个HelloServlet字符串
        rep.getWriter().println("Hello Servlet...");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
