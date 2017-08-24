package com.web.servlet;

import com.web.User;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Create by mr.wl on 2017/8/19
 * Servlet三大域
 * request域  请求域,生命周期很短
 * session 域  默认为30分钟  控制登录  标记登录状态 表示一个会话
 * context 应用域 生命周期最长  伴随整个应用
 */
public class ServletTest1 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String paaaword = req.getParameter("pwd");
//        String a = req.getContextPath();
//        String b = req.getLocalAddr();
//        String url = req.getRequestURI();
//
//        String addr = req.getRemoteAddr();
//
//        System.out.println(name+"  "+paaaword);
//        System.out.println(a+"--"+b+"--"+url+"--"+addr);
        resp.getWriter().write(name);
    }





    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //tomcat iso 8859-1  默认编码
        String name = req.getParameter("nameP");
//        req.setAttribute("name",name);
//        User user = new User("laowang",28);
//        req.setAttribute("User",user);
//
//        User user1 = new User("lao",20);
//        User user2 = new User("lao1",21);
//        User user3 = new User("lao3",23);
//        List<User> list = new ArrayList<User>();
//        list.add(user1);
//        list.add(user2);
//        list.add(user3);
//        req.setAttribute("UserList",list);
        //请求转发
        req.getRequestDispatcher("/WEB-INF/demo.jsp").forward(req,resp);
        //请求重定向
        //resp.sendRedirect("demo2");
//        String paaaword = req.getParameter("pwdP");
        /*
        操作session
        String str = (String) req.getSession().getAttribute("name");
        */
        /*
        操作context
        String str = req.getServletContext().getInitParameter("name");
        System.out.println(str);*/

        //设置cookie时,只能传入数字字母,不能有符号和中文
//        Cookie cookie = new Cookie("name",name);
//        cookie.setMaxAge(60*60);//设置Cookie的最大存在时间,以秒为单位
//        resp.addCookie(cookie);



//
//        PrintWriter out = resp.getWriter();
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>哈哈</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println(name+"------"+paaaword);
//        out.println(new Date());
//        out.println("</body>");
//        out.println("</html>");
//        out.close();
    //    System.out.println(name+"  "+paaaword);
    }

}
