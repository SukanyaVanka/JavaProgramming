package com.package1;

abstract public class PracticeTwo {
   abstract String Animal();
}
class m extends PracticeTwo{
    public static void main(String[] args) {

    }
    String  Animal(){
        return "sarika";

    }
}
interface  PracticeThree{
    String java();
    int face();

}
class has extends PracticeTwo implements PracticeThree{
   public  String java(){
       System.out.println("savannana");
        return "java";
    }
   public int face(){
        return 3;
    }
    String Animal(){
        return "opps";
    }

}
class sona extends has{

}