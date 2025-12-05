package com.example.service;
import java.util.List;

import com.example.dao.StudentDao;
import com.example.dao.StudentDaoImpl;
import com.example.model.Student;
import com.example.util.InputUtil;
import com.example.util.ValidationUtil;
public class StudentServiceImpl implements StudentService{
    private StudentDao dao= new StudentDaoImpl();
    @Override
    public boolean addStudent(){
        int id =InputUtil.getInt("Enter id: ");
        while(!ValidationUtil.isValidId(id)){
            System.out.println("InValid id from service.");
            id =InputUtil.getInt("Enter id: ");
        }

        String name=InputUtil.getString("Enter name :");
        while(!ValidationUtil.isValidName(name)){
            System.out.println("InValid name from service.");
            name=InputUtil.getString("Enter name :");
        }

        int age=InputUtil.getInt("Enter age :");
        while(!ValidationUtil.isValidAge(age)){
            System.out.println("InValid age from service.");
            age=InputUtil.getInt("Enter age :");
        }

        String email=InputUtil.getString("Enter email :");
        while(!ValidationUtil.isValidEmail(email)){
            System.out.println("InValid email from service.");
            email=InputUtil.getString("Enter email :");
        }
        Student student = new Student(id, name, age, email);
       return dao.saveStudent(student);
    }
    @Override
    public Student getStudent(){
        int id =InputUtil.getInt("Enter id: ");
        while(!ValidationUtil.isValidId(id)){
            System.out.println("InValid id from service.");
            id =InputUtil.getInt("Enter id: ");
        }
        return dao.findStudent(id);
    }
    @Override
    public List<Student> getAllStudent(){
        return dao.findAllStudent();
    }
    @Override
    public boolean updateStudent(){
        int id=InputUtil.getInt("Enter student id to update: ");
        while(!ValidationUtil.isValidId(id)){
            System.out.println("InValid id from service.");
            id =InputUtil.getInt("Enter id: ");
        }
        Student s=dao.findStudent(id);
        if(s!=null){ 
            System.out.println("Old Student data is :"+s);
            String name=InputUtil.getString("Enter name :");
            while(!ValidationUtil.isValidName(name)){
                System.out.println("InValid id from service.");
                name=InputUtil.getString("Enter name :");
            }

            int age=InputUtil.getInt("Enter age :");
            while(!ValidationUtil.isValidAge(age)){
                System.out.println("InValid age from service.");
                age=InputUtil.getInt("Enter age :");
            }

            String email=InputUtil.getString("Enter email :");
            while(!ValidationUtil.isValidEmail(email)){
                System.out.println("InValid email from service.");
                email=InputUtil.getString("Enter email :");
            }
            s=new Student(id,name,age,email);
        }
        return dao.updateStudent(s);
    }
    @Override
    public boolean deleteStudent(){
        int id =InputUtil.getInt("Enter id: ");
        while(!ValidationUtil.isValidId(id)){
            System.out.println("InValid id from service.");
            id =InputUtil.getInt("Enter id: ");
        }
        return dao.deleteStudent(id);
    }
}
