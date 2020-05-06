package servlet;


//下面是导入相应的包

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

/**
 * 这是第一个Servlet的例子
 * @author 韦成成

 */
import javax.servlet.http.HttpServlet;

public class ServletDemoFirst extends HttpServlet {
    //用于处理客户端发送的GET请求
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //这条语句指明了向客户端发送的内容格式和采用的字符编码．
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //利用PrintWriter对象的方法将数据发送给客户端
        out.println("您好");
        out.close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //这条语句的作用是，当客户端发送POST请求时，调用doGet()方法进行处理
        doGet(request, response);
    }

}
