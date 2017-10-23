package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApiApplication {
	@Bean
	public TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory() {
		return new TomcatEmbeddedServletContainerFactory();
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(RestApiApplication.class);
	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RestApiApplication.class, args);
		WebSecurityConfig config = context.getBean(WebSecurityConfig.class);
		//SpringApplication.run(TtsSecurityApplication.class, args);
	}
}
