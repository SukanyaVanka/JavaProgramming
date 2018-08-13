package com.package1;
@FunctionalInterface
abstract interface LamdaExa {
    abstract void vehicle();
    default String car() {
        return"suj";
    }
    static String Vehicle(){
        return"chbdwj";
    }
}
class Veh implements  LamdaExa{
    public static void main(String[] args) {
        Veh v=new Veh();
        v.vehicle();
        v.car();
    }
    LamdaExa d =()-> System.out.println("fgjfjwefg");

     @Override
     public  String car(){
        return "sddhbas";
     }

    @Override
    public void vehicle() {
        System.out.println("bjsfbsf");

    }

}
