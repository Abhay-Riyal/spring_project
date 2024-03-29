package com.example.studentapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Long addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/byUniversity/{university}")
    public List<Student> getAllStudentsByUniversity(@PathVariable String university) {
        return studentService.getAllStudentsByUniversity(university);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
}

