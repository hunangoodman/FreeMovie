package com.code.action;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={"com.code.*"})
@MapperScan("com.code.dao")
public class Springbootaction extends SpringBootServletInitializer {
	
	 @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(Springbootaction.class);  
    }  
	
	public static void main(String[] args) {
		SpringApplication.run(Springbootaction.class, args);
	}
}
