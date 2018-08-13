package com.package1;

import java.util.Scanner;

public class CardExample {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter card number: ");
        String cardNumber = scr.next();

        try {
            if(cardNumber.length() == 16){
                System.out.println("Card is valid");
            }else{
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Incorrect Card Number");
            System.exit(0);
        }

                try {
                String a = cardNumber.substring(0, 4);

                switch (a) {
                    case "3712": {
                        System.out.println("AMEX card selected");
                        break;
                    }
                    case "4211": {
                        System.out.println("VISA card selected");
                        break;
                    }
                    case "6777": {
                        System.out.println("MC card selected");
                        break;
                    }
                    default: {

                        throw new Exception();
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid Credit card used.. Please use AMEX, VISA or MC card..");
                System.exit(0);
            }

            String cvvNumber=scr.next();


            try{

                if(cvvNumber.length() ==3){
                    System.out.println("cvv number is correct");
                }else{
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println("Incorrect cvv Number");
                System.exit(0);
            }
            try{
                int b=Integer.valueOf(cvvNumber) ;
                if(b!=000){
                    System.out.println("The card's security code is valid");
                }else{
                    throw new CustomException("Invalid cvvnumber");

                }

            }catch (Exception e){
                System.exit(0);
            }


            int expirationMonth=scr.nextInt();

            try {
                if ((expirationMonth > 0)  && (expirationMonth < 13)) {

                    System.out.println("Month is valid");
                }else{
                    throw new CustomException("Incorrect Month");
                }
            }catch(Exception e){
                System.exit(0);
            }
            try{
                if(expirationMonth !=00){
                    System.out.println("Month is correct");
                }else{
                    throw new Exception();
                }
            }catch (Exception e){
                System.out.println("Invalid month");
                System.exit(0);
            }

             int expirationYear=scr.nextInt();
            try {if ((expirationYear >2018) &&(expirationYear<2022)){

                System.out.println("Year is valid");
            }else{
                throw new Exception();
            }
            }catch(Exception e){
                System.out.println("Incorrect Year");

            }

            }
    }

