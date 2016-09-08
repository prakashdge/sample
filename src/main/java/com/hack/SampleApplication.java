package com.hack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(scanBasePackages="com.hack")
@Configuration
public class SampleApplication {

	
	private static final Logger log = LoggerFactory.getLogger(SampleApplication.class);

	public static void main(String[] args) {
		log.info("====================");
		for (String string : args) {
			System.out.println("Args 	:" + string);
		}
		log.info("====================");
		SpringApplication.run(SampleApplication.class, args);
	}
	
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**");
            }
        };
    }
	
}
