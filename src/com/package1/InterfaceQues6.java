package com.package1;

public abstract class InterfaceQues6 {
   abstract String name();
   int method(){
       System.out.println("sukanya");
       return 44;
   }
}
interface Interface1{
    int var();
}
interface Interface2{
    String method();
}
//we can not extend two abstract classes at a time(dont allow multiple Inheritance)
class s extends InterfaceQues6{
String name(){
    return "sukanya";
}
}
//we can implement both interfaces at a time(allow multiple Inherritance )
class d implements Interface1,Interface2{
    public int var(){
        return 334;
    }
    public String method(){
        return "suknya";
    }

    public static void main(String[] args) {
        InterfaceQues6 o=new s();
        o.name();
        System.out.println(o.name());
        Interface2 inter=new d();
        System.out.println(inter.method());

    }
}