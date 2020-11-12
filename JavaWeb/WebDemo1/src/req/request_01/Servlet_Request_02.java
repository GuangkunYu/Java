package req.request_01;

/*
    request对象接收表单请求参数
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet(name = "Servlet_Request_02", urlPatterns = "/Servlet_Request_02")
public class Servlet_Request_02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*// 接收用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 接收性别和籍贯
        String sex = request.getParameter("sex");
        String city = request.getParameter("city");
        // 接收爱好
        String[] hobbies = request.getParameterValues("hobby");
        // 接收自我介绍
        String info = request.getParameter("info");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
        System.out.println("性别：" + sex);
        System.out.println("籍贯：" + city);
        System.out.println("爱好：" + Arrays.toString(hobbies));
        System.out.println("自我介绍：" + info);*/

        // 使用getParameterMap接收数据
        Map<String, String[]> map = request.getParameterMap();
        for (String key: map.keySet()){
            String[] value = map.get(key);
            System.out.println(key + ":  " + Arrays.toString(value) );
        }
    }
}
