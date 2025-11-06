package com.tnsif.StudentServices.config;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig {


// Allow all origins during development. Lock this down in production.
@Bean
public WebMvcConfigurer corsConfigurer() {
return new WebMvcConfigurer() {
@Override
public void addCorsMappings(CorsRegistry registry) {
registry.addMapping("/**").allowedMethods("GET","POST","PUT","DELETE","PATCH");
}
};
}
}