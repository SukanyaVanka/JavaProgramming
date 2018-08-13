package com.package1;

public class PracticeExamples {
    int a = 10;
    int b;
    Integer  obj=b;
    String c = "nanii";

    PracticeExamples() {//constructor default

    }

    PracticeExamples(int a, int b) {//2 argmnt Constructor//constructor overloading

    }

    public static void main(String[] args) {

        String s = "sukanya";
        String c = "saavan hh,a,c,d,";
        for(int i=0;i<c.length();i++){
            Character obj=c.charAt(i);
            System.out.println(obj);
        }
       String f= c.substring(2);
        System.out.println(f);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        PracticeExamples p = new PracticeExamples();   //Creation of object
        p.a=12;
        System.out.println(p.a);
        new PracticeExamples();
        new PracticeExamples().m1();//calling method using constructor
        p.m1();//calling method using refrnce var
        m2();
        p.c = "sravani";
        System.out.println(c + s);
        System.out.println(p.a+c);
        p.m1("jjevan",8);
        m2();
        System.out.println();
       System.out.println( p.toString());
       System.out.println(new PracticeExamples());
        PracticeExamples l=new sec();
        l.m1();
        sec d=new sec();
        d.m1();
        m2();
    }


     public   String  m1() {
          final  int d = 12;

            String c = "dvbskdvjb";
            System.out.println("saraswathi");
            return "savadan";
        }
        void m1(int a){
        System.out.println("suakanyaakaka");
        }
    final    void m1(String c, int h){
        System.out.println("sanjana");
        }
    static   String  m2(){
        System.out.println("varada");
        return "vvkkk";
        }//method overloading

    }
    class sec extends  PracticeExamples{
  protected static   String m2(){
        System.out.println("saroja");
        return "samjeeth";
    }//over riding
    public     String m1() {
            System.out.println(super.m1());
            return super.m1();

        }
        void setm1(int a){
      this.a=2;
        }
        int getm1(int a){
      return 4;
        }


    }
