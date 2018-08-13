package com.package1;
 interface InterfaceQus2 {
     String name();

 }
 interface InterfaceQues2{
     int method1();

 }
 //cant override return  types; we can override same method with diff arguments but not return types
 class InterfaceAns2 implements InterfaceQues2,InterfaceQus2{
     public String name(){
         return "sukanya";

     }
    public  int method1(){
         return 5;
     }

     public static void main(String[] args) {
         InterfaceQus2 iq=new InterfaceAns2();
         iq.name();
         System.out.println(iq.name());
     }
 }
