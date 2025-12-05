package com.example.exception;
public class StudentNotFound extends RuntimeException{
    public StudentNotFound(){
        super();
    }
    public StudentNotFound(String msg){
        super(msg);
    }
}
