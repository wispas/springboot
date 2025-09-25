package com.students.microservices.student_service;

import org.springframework.boot.SpringApplication;

public class TestStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(StudentServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
