package com.package1;

abstract class InterfaceQue4 {
    static {
        System.out.println("example");
    }
    {
        System.out.println("sukanya");
    }
    int name(){
        System.out.println("example2");
        return 7;
    }
    //Static, instance
}
class z extends InterfaceQue4{
    public static void main(String[] args) {
        InterfaceQue4 i=new z();
    }
    }

