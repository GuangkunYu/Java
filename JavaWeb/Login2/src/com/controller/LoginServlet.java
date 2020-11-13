package com.controller;

import com.domain.User;
import com.model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            // 1.接受数据
            // 处理乱码
            request.setCharacterEncoding("UTF-8");
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // 2.封装数据
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);

            // 3.处理数据
            UserModel userModel = new UserModel();
            User existUser = userModel.login(user);

            // 4.页面跳转
            if (existUser == null){
                // 登录失败
                // 向request域中保存一个错误信息
                request.setAttribute("msg", "用户名或密码错误！");
                // 使用请求转发进行页面跳转
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }else {
                // 登录成功
                // 将用户的信息保存到会话中
                HttpSession session = request.getSession();
                session.setAttribute("existUser", existUser);
                // 重定向到成功页面
                response.sendRedirect("/Login2/success.jsp");
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
