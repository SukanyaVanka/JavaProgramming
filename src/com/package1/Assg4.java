package com.package1;

import java.util.Scanner;

public class Assg4 {
    public static void main(String[] args) {
        String s = "This is a java Class";
       String  Str1=" ";
        String [] k=s.split(" ");
        String a = s.toUpperCase();
        String b = s.replaceAll("java", "SQL");
        System.out.println(a);
        System.out.println(b);
for(int i=0;i<s.length();i++){
    System.out.println(k[i]+" ");
}
        for(int i=s.length()-1;i>=0;i--) {

    Str1=Str1+k[i] + " ";
        }
        System.out.println(Str1);

        }

    }