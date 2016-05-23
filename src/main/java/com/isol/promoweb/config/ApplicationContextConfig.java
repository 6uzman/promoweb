package com.isol.promoweb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Miguel Guzman on 20/05/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.isol.promoweb.mvc")
@EnableTransactionManagement
@PropertySource(value={ "classpath:app.properties" })

public class ApplicationContextConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private Environment environment;

    /*
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    } */

}
