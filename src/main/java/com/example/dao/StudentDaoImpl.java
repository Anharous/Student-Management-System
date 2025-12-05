package com.example.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.exception.StudentNotFound;
import com.example.model.Student;
import com.example.util.DBConnection;
public class StudentDaoImpl implements StudentDao {
    @Override
    public boolean saveStudent(Student student){
        String query ="insert into student values(?,?,?,?)";
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement statement =connection.prepareStatement(query);
            statement.setInt(1,student.getId());
            statement.setString(2,student.getName());
            statement.setInt(3,student.getAge());
            statement.setString(4,student.getEmail());
            return statement.executeUpdate()>0;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        
    }

    @Override
    public Student findStudent(int id){
        String query="select * from student where id=?";
        Student student=null;
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement ps=connection.prepareStatement(query);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
                student = new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
            else
                throw new StudentNotFound("Student with id "+id+" Not found");
        }catch(SQLException e){
            e.printStackTrace();
        }
         return student;
    }

    @Override
    public List<Student> findAllStudent(){
        String query = "select * from student";
        List<Student> list = new ArrayList<>();
        try(Connection connection = DBConnection.getConnection()){
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                list.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean updateStudent(Student s){
        String query="update student set  name=? , age=?, email=? where id=?";
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement ps= connection.prepareStatement(query);
            ps.setString(1,s.getName());
            ps.setInt(2,s.getAge());
            ps.setString(3,s.getEmail());
            ps.setInt(4,s.getId());
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Failed to update student!");
            e.printStackTrace();
            return false;
        }
    }
    @Override
    public boolean deleteStudent(int id){
        String query="delete from student where id=?";
        if(findStudent(id)!=null){
            try(Connection connection = DBConnection.getConnection()){
                PreparedStatement ps=connection.prepareStatement(query);
                ps.setInt(1,id);
                return ps.executeUpdate()>0;
            }catch(SQLException e){
                System.out.println("Deletion Failed");
                e.printStackTrace();
                return false;
            }
        }else{
            return false;
        }
        
    }
}
