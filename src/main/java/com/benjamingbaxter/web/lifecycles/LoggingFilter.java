package com.benjamingbaxter.web.lifecycles;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter("/*")
public class LoggingFilter implements Filter {

    private static final String LOG_TAG = LoggingFilter.class.getSimpleName();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(LOG_TAG + " init'ing filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(LOG_TAG + " pre-processing request");
        chain.doFilter(request, response);
        System.out.println(LOG_TAG + " post-processing request");
    }

    @Override
    public void destroy() {
        System.out.println(LOG_TAG + " destroying filter");
    }
}
