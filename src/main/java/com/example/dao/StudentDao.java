package com.example.dao;
import java.util.List;

import com.example.model.Student;

public interface StudentDao {
     boolean saveStudent(Student student);
     Student findStudent(int id);
     List<Student> findAllStudent();
     boolean updateStudent(Student s);
     boolean deleteStudent(int id);
}
