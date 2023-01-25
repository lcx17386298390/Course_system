package com.evan.demo.fileListener;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;



@EnableAutoConfiguration
@Configuration
public class UploadProgressApplication {
    @Bean(name = "multipartResolver")
    public MultipartResolver multipartResolver() {
        CustomMultipartResolver customMultipartResolver = new CustomMultipartResolver();
        return customMultipartResolver;
    }
}
