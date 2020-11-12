package res.response_02;

/*
    Response响应中文的处理
 */

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_Response_03", urlPatterns = "/Servlet_Response_03")
public class Servlet_Response_03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 使用字节流的方式输出中文
//        test1(response);

        // 使用字符流响应中文
        test2(response);
    }

    // 使用字符流的方式输出中文
    private void test2(HttpServletResponse response) throws IOException {
        // 设置浏览器默认打开的时候采用的字符集
        // response.setHeader("Content-Type", "text/html;charset=UTF-8");
        // 设置response获得字符流的缓冲区的编码
        // response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("中文");
    }


    // 使用字节流的方式输出中文
    private void test1(HttpServletResponse response) throws IOException {
        ServletOutputStream ops = response.getOutputStream();
        // 设置浏览器默认打开的时候采用的字符集
        response.setHeader("Content-Type", "text/html;charset=UTF-8");
        // 设置中文转成字节数组字符集编码
        ops.write("中文好啊".getBytes("UTF-8"));
    }
}
