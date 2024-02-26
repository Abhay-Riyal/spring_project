package com.example.studentapplication;

import java.util.List;

public interface StudentService {
    Long addStudent(Student student);
    List<Student> getAllStudentsByUniversity(String university);
    Student getStudentById(Long id);
}