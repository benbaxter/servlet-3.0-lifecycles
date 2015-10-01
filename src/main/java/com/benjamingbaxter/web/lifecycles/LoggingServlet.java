package com.benjamingbaxter.web.lifecycles;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/")
public class LoggingServlet extends HttpServlet {

    private static final String LOG_TAG = LoggingServlet.class.getSimpleName();

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println(LOG_TAG + " is being init'd");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println(LOG_TAG + ": doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println(LOG_TAG + ": doPost");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println(LOG_TAG + ": destroyed");
    }
}
