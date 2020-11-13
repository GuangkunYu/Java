package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InitServlet", urlPatterns = "/InitServlet", loadOnStartup = 2)
public class InitServlet extends HttpServlet {
    @Override
    // 初始化的方法,配置为启动时加载
    public void init() throws ServletException {
        // 初始一个值为0
        int count = 0;
        // 将这个值存入到servletcontext域中
        this.getServletContext().setAttribute("count", count);
    }
}
