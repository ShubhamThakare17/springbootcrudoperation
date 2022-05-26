package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo" )
@ComponentScan(basePackages = {"controller","service","repository","entities"})
@EntityScan(basePackages = {"controller","service","repository","entities"})
@EnableJpaRepositories(basePackages = {"repository"})
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		
		
		
		
	}

}
