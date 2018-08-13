package com.package1;



interface InterfaceQus3 {
   Boolean name();
   static int name1(){
       return 3;
   }

//we cant insert static and instance block
}
class InterfaceAns3 implements InterfaceQus3{
    static int a=5;
   public Boolean name(){
        return false;
    }
    static String method(){
       System.out.println("method");
       return "Virginia";
    }
    public static void main(String[] args) {
        InterfaceQus3 a=new InterfaceAns3();
        ((InterfaceAns3) a).method();
        System.out.println(((InterfaceAns3) a).method());

    }
}

