package com.example;

import java.util.List;
import java.util.Scanner;

import com.example.model.Student;
import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;
public class App 
{
    private static StudentService service= new StudentServiceImpl();
    private static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
        while(true){
            System.out.println("1.Add Student");
            System.out.println("2.Find student");
            System.out.println("3.Find all students");
            System.out.println("4.Update Student");
            System.out.println("5.Delete Student");
            System.out.println("6.Exit");
            System.out.println("Enter the Option");
            int option =sc.nextInt();
            switch(option){
                case 1:
                    // System.out.println("Enter id");
                    // int id=InputUtil.getInt("Enter id :");
                    // sc.nextLine();
                    // String name=InputUtil.getString("Enter name :");
                    // int age=InputUtil.getInt("Enter age :");
                    // sc.nextLine();
                    // String email=InputUtil.getString("Enter email :");
                    // Student s=new Student(id,name,age,email);
                    if(service.addStudent())
                        System.out.println("Student created!");
                    else
                        System.out.println("Failed");
                    break;
                case 2:
                    Student s=service.getStudent();
                    if(s!=null)
                        System.out.println(s);
                    break;
                case 3:
                    List<Student> stds=service.getAllStudent();
                    System.out.println(!stds.isEmpty()?stds.toString():"No Record Found!");
                    break;
                case 4:
                    if(service.updateStudent())
                        System.out.println("Student Updated!");
                    else
                        System.out.println("Failed");
                    break;
                case 5:
                    if(service.deleteStudent())
                        System.out.println("Deleted Successfully!");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Opion");
            }
        }
    }
}
