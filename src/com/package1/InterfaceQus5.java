package com.package1;

import java.sql.SQLOutput;

public class InterfaceQus5 {
    InterfaceQus5() {
        System.out.println("Constructor");
    }

    static{
        System.out.println("String name");
    }
    {
        System.out.println("sukanya");
    }
    //Static, Instance, Constructor
    static String name;
    int name1;
    static String name2(){
        return "example";
    }
    int name(){
        System.out.println("return vallue");
        return 5;
    }
    public static void main(String[] args) {
        InterfaceQus5 a = new InterfaceQus5();
        a.name = "virginia";
        a.name1=5;
        System.out.println(a.name);
        System.out.println(a.name1);
    }

}