package com.example.service;
import java.util.List;

import com.example.model.Student;
public interface StudentService {
    boolean addStudent();
    Student getStudent();
    List<Student> getAllStudent();
    boolean updateStudent();
    boolean deleteStudent();
}
