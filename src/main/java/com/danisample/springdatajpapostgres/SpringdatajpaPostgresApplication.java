package com.danisample.springdatajpapostgres;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdatajpaPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaPostgresApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student maria = new Student("Maria", "Jones", "maria.jones@email.com", 21);
			studentRepository.save(maria);
		};
	}
}
