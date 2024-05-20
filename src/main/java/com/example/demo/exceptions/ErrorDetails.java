package com.example.demo.exceptions;

public class ErrorDetails{
    private  String message ;
    public ErrorDetails(String message ){
        this.message=message;
    }
    public void setMessage(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}
