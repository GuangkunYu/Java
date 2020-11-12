package res.response_01;

/*
    Response关于响应行的方法：
        setStatus()：设置响应的状态码：200  302  304  404  500
    Response关于响应头的方法：
        setHeader()：set开头的方法，针对一个key对应一个value的情况
        addHeader()：add开头的方法，针对一个key对应多个value的情况
     Response关于响应体的方法：
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Response_01", urlPatterns = "/Servlet_Response_01")
public class Servlet_Response_01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应状态码
//        response.setStatus(302);
        // 完成重定向
//        response.setStatus(302);
        // 重定向：302状态码和location响应头结合使用的效果
        // 设置响应头
//        response.setHeader("Location", "/WebDemo1/Servlet_Response_02");

        // 定时刷新
//        response.setContentType("text/html; charset=UTF-8");
//        response.getWriter().println("5秒后页面刷新");
//        response.setHeader("Refresh", "5;url=/WebDemo1/Servlet_Response_02");
    }
}
