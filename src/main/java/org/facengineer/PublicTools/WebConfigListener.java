package org.facengineer.PublicTools;

import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Configuration
public class WebConfigListener implements ServletContextListener {

    LOG _logger = new LOG(WebConfigListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
        }catch(Exception e){
            _logger.error(e.getMessage());
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            LOG.info("Listener Destroyed Startup");
        }catch (Exception e){
            _logger.error(e.getMessage());
        }
    }
}