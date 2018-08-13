package com.package1;

class p{
String nam="virginia";
int nam1=401;
String nameOfMethod(){
    return "sukanya";
}
int nameOfMethod1(){
    return 44;
}
}
class c extends p{
    String classname="classname";
    int methodname=890;
    void nameOfTheClass(){
        System.out.println("nameoftheclass");
    }
    String nameOfThemethod(){
        return "nameOfTheMethod";
    }
    String nam="Sterling";
    int nam1=501;
    String nameOfMethod(){
        return "Virginia beach";
    }

    public static void main(String[] args) {
        p P=new c();
        P.nameOfMethod1();
        System.out.println(((c) P).nameOfThemethod());
    }

}