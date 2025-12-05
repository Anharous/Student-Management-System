package com.example.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {

    private final static String URL="jdbc:mysql://localhost:3306/student";
    private final static String USER="root";
    private final static String PWD="Amir26";
    public static Connection getConnection(){
        Connection con=null;
        try{
            con=DriverManager.getConnection(URL,USER,PWD);
        }catch(SQLException e){
            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return con;
    }
    
}
