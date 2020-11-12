package req.request_01;

/*
    request对象的API
        获得客户机信息
            getMethod()获得请求方式
            getQueryString()获得请求路径后的提交参数的字符串
            getRequestURL()获得请求路径的URL
        获得请求头信息方法
            getHeader()获得一个key对应一个value的请求头
            getHeaders()获得一个key对应多个value的请求头
        获得请求参数的方法
            getParameter()获得提交的参数：一个名称对应一个value
            getParameterValues()获得提交参数：一个名称对应多个value
            getParameterMap()获得提交的参数，将提交的参数的名称和对应得值存入Map集合中
        作为域对象存取数据的方法
            setAttribute()
            getAttribute()
            removeAttribute()
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Request_01", urlPatterns = "/Servlet_Request_01")
public class Servlet_Request_01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获得客户机信息
        test1(request);
    }


//    获得客户机信息
    private void test1(HttpServletRequest request) {
        // 获得请求方式
        System.out.println("请求方式：" + request.getMethod());
        // 获得请求IP地址
        System.out.println("IP: " + request.getRemoteAddr());
        // 获得请求参数字符串
        System.out.println("请求参数字符串："+request.getQueryString());
        // 获得请求路径的URL和URI
        System.out.println("URL: " + request.getRequestURL());
        System.out.println("URI: " + request.getRequestURI());
        // 获得请求头的信息
        System.out.println("获得客户机浏览器的类型：" + request.getHeader("User-Agent"));
    }
}
