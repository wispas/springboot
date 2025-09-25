package com.students.microservices.student_service.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name")
    private String studentName;

    @Column(nullable = false, unique = true)
    private String email;

    private Integer age;

    private String course;
    public Student() {}

    public Student(String studentName, String email, Integer age, String course) {
        this.studentName = studentName;
        this.email = email;
        this.age = age;
        this.course = course;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}
