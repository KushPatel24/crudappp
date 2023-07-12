package com.patel.service;

import com.patel.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService{
    Student create(Student student);
}
