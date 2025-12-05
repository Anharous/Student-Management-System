package com.example.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import io.github.cdimascio.dotenv.Dotenv;

public class DBConnection {
    private static final Dotenv dotenv = Dotenv.load();

    private final static String URL="jdbc:mysql://localhost:3306/student";
    private final static String USER="root";
    private final static String PWD=dotenv.get("DB_PASSWORD");
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
