package com.students.microservices.student_service.repository;

import com.students.microservices.student_service.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Finds students whose names contain the given string, ignoring case
    List<Student> findByStudentNameContainingIgnoreCase(String studentName);
    List<Student> findByEmailContainingIgnoreCase(String email);
    List<Student> findByCourseContainingIgnoreCase(String course);
}
