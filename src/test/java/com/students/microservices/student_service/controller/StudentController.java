package com.students.microservices.student_service.controller;

import com.students.microservices.student_service.entity.Student;
import com.students.microservices.student_service.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    @GetMapping
    public List<Student> getStudents(@RequestParam(required = false) String studentName) {
        return service.getStudents(studentName);
    }
}