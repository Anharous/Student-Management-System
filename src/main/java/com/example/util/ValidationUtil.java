package com.example.util;

public class ValidationUtil {
    public static boolean isValidName(String name){
        return name.matches("[A-Za-z]{2,}");
    }
    public static boolean isValidId(int id){
        return id>0;
    }
    public static boolean isValidAge(int age){
        return age>=18 && age<=60;
    }
    public static boolean isValidEmail(String email){
        return email.matches("^[A-Za-z0-9._+-]+@[A-Za-z0-9.-]+$");
    }
}
