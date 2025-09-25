package com.students.microservices.student_service.service;

import com.students.microservices.student_service.entity.Student;
import com.students.microservices.student_service.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        Student existing = repository.findById(id).orElseThrow();
        existing.setStudentName(student.getStudentName());
        return repository.save(existing);
    }

    public List<Student> getStudents(String studentName) {
        if (studentName == null || studentName.isEmpty()) {
            return repository.findAll();
        }
        return repository.findByStudentNameContainingIgnoreCase(studentName);
    }
}