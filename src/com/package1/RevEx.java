package com.package1;

public class RevEx {
    public static void main(String[] args) {
        int input=34768;
        int rever=0;
        while(input !=0){
            rever=rever*10;
            rever=rever+input%10;
            input=input/10;
        }
        System.out.println(rever);
    }
}

