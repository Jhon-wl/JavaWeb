package com.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Create by mr.wl on 2017/8/19
 */
public class ServletTest1 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String paaaword = req.getParameter("pwd");
        String a = req.getContextPath();
        String b = req.getLocalAddr();
        String url = req.getRequestURI();

        String addr = req.getRemoteAddr();

        System.out.println(name+"  "+paaaword);
        System.out.println(a+"--"+b+"--"+url+"--"+addr);
    }





    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //tomcat iso 8859-1  默认编码
        String name = req.getParameter("nameP");
        String paaaword = req.getParameter("pwdP");

//        resp.setContentType("text/html,charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>哈哈</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(name+"------"+paaaword);
        out.println(new Date());
        out.println("</body>");
        out.println("</html>");
        out.close();
        System.out.println(name+"  "+paaaword);
    }

}
