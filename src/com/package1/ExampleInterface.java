package com.package1;

interface x {
    String m1();
    abstract void m2();
}
class y implements x{

    public String  m1() {
        return "sukanya";
    }

    @Override
    public void m2() {

    }
    public static void main(String[] args){
        x a=new y();
        a.m1();
        System.out.println(a.m1());
        System.out.println("Interface");
    }
}