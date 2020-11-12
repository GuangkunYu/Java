package req.request_01;

/*
    request接收中文数据
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Request_03", urlPatterns = "/Servlet_Request_03")
public class Servlet_Request_03 extends HttpServlet {
    // post方式处理中文乱码
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         *  产生乱码的原因：
         *      post方式提交的数据是在请求体中，request对象接收到数据之后，放入request的缓冲区中，缓冲区就有编码(ISO-8859-1，不支持中文)
         *  解决方案：
         *      将request的缓冲区的编码进行修改
         */
        // 设置缓冲区编码
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        System.out.println("name: " + name);
    }
    // get方式处理中文乱码
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         *  产生乱码的原因：
         *      get方式提交的数据是在请求行的URL中，在地址栏已经进行了一次URL编码，
         *  解决方案：
         *      现将存入到request缓冲区中的内容以ISO-8859-1的方式获取
         *      在以UTF-8进行解码
         */
        String name = request.getParameter("name");
        System.out.println("name: " + name);
    }
}
