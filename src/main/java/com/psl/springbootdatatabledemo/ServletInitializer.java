package com.psl.springbootdatatabledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.psl.repository")
@EntityScan(basePackages = "com.psl.model")
@ComponentScan(basePackages = { "com.psl.controllers", "com.psl.service", "com.psl.service.impl" })
public class ServletInitializer extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ServletInitializer.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ServletInitializer.class);
	}

}
