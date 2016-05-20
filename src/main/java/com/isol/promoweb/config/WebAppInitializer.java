package com.isol.promoweb.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * Created by Miguel Guzman on 16/05/2016.
 */

public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {
        AnnotationConfigWebApplicationContext  appContext = new AnnotationConfigWebApplicationContext ();
        //add all configuration class
        appContext.register(JpaConfig.class,WebConfig.class);
        container.addListener (new ContextLoaderListener(appContext));

        ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcherServlet", new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

}