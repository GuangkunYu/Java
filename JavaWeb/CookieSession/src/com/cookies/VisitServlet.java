package com.cookies;

import com.utils.CookieUtils;
import javafx.scene.input.DataFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "VisitServlet", urlPatterns = "/VisitServlet")
public class VisitServlet extends HttpServlet {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         *  用户访问servlet
         *      如果是第一次访问：
         *          显示：你好，欢迎来到本网站
         *          记录当前访问时间，存入到cookie，写回到浏览器
         *      如果不是第一次：
         *          从cookie中获取上次时间，显示到页面
         *          记录当前访问时间，存入到cookie，写回到浏览器
         */
        // 判断是否是第一次访问：从指定的cookie的数组中获取指定名称的cookie
        // 获得从浏览器带过来的所有Cookie
        Cookie[] cookies = request.getCookies();
        // 从数组中找到指定名称的cookie：
        Cookie cookie = CookieUtils.findCookie(cookies, "lastVisit");
        // 判断是否是第一次访问
        if (cookie == null) {
            // 是第一次访问
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("<h1>你好，欢迎来到本网站</h1>");
        } else {
            // 不是第一次访问，
            // 获得cookie中的上次访问时间，显示到页面
            String value = cookie.getValue();
            value = URLDecoder.decode(value, "utf-8");
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("<h1>你好，你的上次访问时间为" + value + "</h1>");
        }
        // 记录当前时间存入到cookie，回写浏览器
        Date date = new Date();
        Cookie c = new Cookie("lastVisit", URLEncoder.encode(simpleDateFormat.format(date), "utf-8"));
        response.addCookie(c);
    }
}
