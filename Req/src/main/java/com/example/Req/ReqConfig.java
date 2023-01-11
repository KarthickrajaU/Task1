package com.example.Req;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ReqConfig {
    public final WebMvcConfigurer corsConfigurer() {
        return (WebMvcConfigurer)(new WebMvcConfigurer() {
            public void addCorsMappings( CorsRegistry registry) {
            //    Intrinsics.checkNotNullParameter(registry, "registry");
                registry.addMapping("/**").allowedMethods(new String[]{"*"}).allowedOrigins(new String[]{"*"});
            }
        });
    }
}
