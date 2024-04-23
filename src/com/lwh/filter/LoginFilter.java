package com.lwh.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : Luowenhao221
 * @date : 2024/4/23 22:51
 * @Project : JavaEEtest_1-by-Lwh221
 */
@WebFilter("/*")
public class LoginFilter implements Filter {

    /**
     * 登录过滤器
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }


    /**
     * 登录过滤器
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String uri = req.getRequestURI();
        // 如果是登录页面或者登录请求，直接放行
        if (uri.contains("/login.jsp") || uri.contains("/login")) {
            chain.doFilter(request, response);
        } else {
            // 如果是其他请求，判断是否登录
            Object student = req.getSession().getAttribute("student");
            if (student != null) {
                // 如果已经登录，放行
                chain.doFilter(request, response);
            } else {
                // 如果没有登录，跳转到登录页面
                res.sendRedirect("login.jsp");
            }
        }
    }

    @Override
    public void destroy() {
    }
}