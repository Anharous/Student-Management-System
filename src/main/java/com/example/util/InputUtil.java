package com.example.util;
import java.util.Scanner;
public class InputUtil {    //Utility class
    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String msg){
        System.out.println(msg);
        while(!sc.hasNextInt()){
            System.out.println("Invalid");
            sc.next();
            System.out.println(msg);
        }
        return sc.nextInt();
    }

    public static String getString(String msg){
        System.out.println(msg);
        String temp=sc.nextLine().trim();
        while(temp.isEmpty()){
            System.out.println("Invalid");
            System.out.println(msg);
            temp=sc.nextLine().trim();
        }
        return temp;

    }
}
