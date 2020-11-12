package com.servlet_04;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo_04 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlet被初始化了......");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet被执行了......");
    }

    @Override
    public void destroy() {
        System.out.println("servlet被销毁了.........");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    @Override
    public String getServletInfo() {
        return null;
    }


}
