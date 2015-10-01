package com.benjamingbaxter.web.lifecycles;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class LoggingServletListener implements ServletContextListener {

    private static final String LOG_TAG = LoggingServletListener.class.getSimpleName();

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(LOG_TAG + " is initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println(LOG_TAG + " is destroyed");
    }
}
