package com.udacity.vehicles.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Allows the user to access Swagger through the endpoint /swagger-ui.html
        registry.addViewController("/swagger-ui.html").setViewName("redirect:/swagger-ui/index.html");
    }
}
