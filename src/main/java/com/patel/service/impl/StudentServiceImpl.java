package com.patel.service.impl;

import com.patel.Repository.StudentRepository;
import com.patel.model.Student;
import com.patel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student create(Student student){
        return studentRepository.save(student);
    }
}
