package com.students.microservices.student_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class StudentServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
