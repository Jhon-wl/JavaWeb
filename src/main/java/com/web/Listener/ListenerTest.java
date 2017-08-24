package com.web.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Create by mr.wl on 2017/8/23
 */
public class ListenerTest implements ServletContextListener{


    /*//request的监听器   实现 ServletRequestListener接口
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("请求销毁了");
    }

    * 此处先执行的是监听器,执行servletRequestEvent.getServletRequest().getParameterValues("nameP")时
    * 会改变编码,过滤器再过滤编码会导致编码错误,产生乱码
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("监听器初始化");

    }*/

    /*
    //session  实现HttpSessionListenner
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        httpSessionEvent.getSession().setAttribute("name","enen");
        System.out.println("session创建啦");
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("session 销毁啦");
    }*/


    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String str = servletContextEvent.getServletContext().getInitParameter("name");
        servletContextEvent.getServletContext().setInitParameter("evl","qwe");
        System.out.println("容器初始化了"+str);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("容器销毁啦");
    }
}
