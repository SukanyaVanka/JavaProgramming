package com.package1;

public class CustomException extends Exception {

        public String message;

    public CustomException(String message){

        this.message = message;
        System.out.println(message);


    }
}
