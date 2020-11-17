package com.controller;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/*
    生成验证码
 */

@WebServlet(name = "CheckImgServlet", urlPatterns = "/CheckImgServlet")
public class CheckImgServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width = 120;
        int height = 30;

        // 1.绘制一张内存中的图片
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);

        // 2.图片绘制背景颜色--通过绘图对象
        Graphics graphics = bufferedImage.getGraphics();
        // 绘制任何图形之前都必须制定一个颜色
        graphics.setColor(getRandColor(200, 250));
        graphics.fillRect(0, 0, width, height);

        // 3.绘制边框
        graphics.setColor(Color.WHITE);
        graphics.drawRect(0, 0, width-1, height-1);

        // 4.四个随机数字
        Graphics2D graphics2D = (Graphics2D) graphics;
        // 设置输出字体
        graphics2D.setFont(new Font("宋体", Font.BOLD, 18));

        String words = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        // 定义一个StringBuffer
        StringBuffer buffer = new StringBuffer();

        // 定义x坐标
        int x = 10;
        for (int i=0; i<4;i++){
            // 随机颜色
            graphics2D.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20+random.nextInt(110)));
            // 旋转30度
            int jiaodu = random.nextInt(60) - 30;
            // 换算弧度
            double theta = jiaodu * Math.PI / 180;

            // 生成一个随机数字
            int index = random.nextInt(words.length());
            // 获得字母数字
            char c = words.charAt(index);

            // 将随机产生的字符存入到字符串中
            buffer.append(c);

            // 将c输出到图片
            graphics2D.rotate(theta, x, 20);
            graphics2D.drawString(String.valueOf(c), x, 20);
            graphics2D.rotate(-theta, x, 20);
            x += 30;
        }

        // 将buffer转成字符串对象
        String s = buffer.toString();

        // 将其存入到session中
        request.getSession().setAttribute("chechcode", s);

        // 5.绘制干扰线
        graphics.setColor(getRandColor(160, 200));
        int x1;
        int x2;
        int y1;
        int y2;
        for (int i=0; i<30; i++){
            x1=random.nextInt(width);
            x2 = random.nextInt(12);
            y1 = random.nextInt(height);
            y2 = random.nextInt(12);
            graphics.drawLine(x1, y1, x1+x2,x2+y2);
        }

        // 将上面的图片输出到浏览器ImageIO
        graphics.dispose();
        ImageIO.write(bufferedImage, "jpg", response.getOutputStream());
    }

    private Color getRandColor(int i, int i1) {
//        Random random = new Random();
//        int i2 = random.nextInt(50) + 200;
        Color color = new Color(123, 123, 123);
        return color;
    }
}
