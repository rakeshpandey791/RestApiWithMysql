package com.rakesh.RestAPIWithMySql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.rakesh.repository")
@SpringBootApplication
@ComponentScan("com.rakesh")
@EntityScan("com.rakesh.entity")

public class RestApiWithMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiWithMySqlApplication.class, args);
	}
}
