package com.patel.controller;


import com.patel.model.Student;
import com.patel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usermetadata")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/store")
    public Student saveStudent(@RequestBody Student student){
       return studentService.create(student);
    }
}
