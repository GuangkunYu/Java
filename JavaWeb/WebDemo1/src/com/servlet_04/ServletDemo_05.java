package com.servlet_04;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo_05 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet Demo_05... 初始化了");
    }

    @Override
    public ServletConfig getServletConfig() {

        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ServletDemo_05中的service方法执行了...");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
