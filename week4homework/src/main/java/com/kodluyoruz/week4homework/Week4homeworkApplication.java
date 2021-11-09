package com.kodluyoruz.week4homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
public class Week4homeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week4homeworkApplication.class, args);
	}

}
