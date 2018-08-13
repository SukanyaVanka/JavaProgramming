package com.package1;

import java.util.Scanner;

public class ExamplePrgm {
    int cardNumber;
    int cvvNumber;
    int expirationYear;
    ExamplePrgm(){

    }
    ExamplePrgm(int cardNumber,int cvvNumber,int expirationYear ){
        this.cardNumber=cardNumber;
        this.cvvNumber=cvvNumber;
        this.expirationYear=expirationYear;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter cardnumber");
        int cardNumber = scr.nextInt();

        ExamplePrgm ep = new ExamplePrgm();

        if (ep.cardNumber != 0) {
            System.out.println("Enter cardnumber");
        } else {
            System.out.println("Enter valid number");
        }

       try {
           if (String.valueOf(cardNumber).length() == 16) {
               throw new Exception();
           }
       }
       catch(Exception e){
             System.out.println("check card number");
           }
       }

    }

