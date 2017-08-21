package com.web.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by mr.wl on 2017/8/21
 * 过滤器在Tomcat启动的时候就已经加载
 */
public class EncodingFilter implements Filter{

    private String encode = "UTF-8";
    public void init(FilterConfig filterConfig) throws ServletException {
        encode = filterConfig.getInitParameter("encoding");
        System.out.println("过滤器初始化了");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        request.setCharacterEncoding(encode);
        response.setContentType("text/html;charset="+encode);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {
        System.out.println("过滤器销毁了~");
    }
}
