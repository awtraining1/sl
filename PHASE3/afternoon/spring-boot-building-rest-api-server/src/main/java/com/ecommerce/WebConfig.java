package com.ecommerce;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/product/**")
            .allowedOrigins("http://localhost:4200")
            .allowedMethods("*")
            .allowedHeaders("*")
            .allowCredentials(false)
            .maxAge(3600);
    }
}
