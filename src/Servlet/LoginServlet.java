package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 获取请求中的用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("username: " + username);
        System.out.println("password: " + password);

        // 验证用户名和密码
        if ("admin".equals(username) && "password".equals(password)) {
            // 登录成功
            response.setContentType("text/html");
            response.getWriter().write("<p>Login successful!</p>");
        } else {
            // 登录失败
            response.setContentType("text/html");
            response.getWriter().write("<p>Login failed: incorrect username or password.</p>");
        }
    }
}