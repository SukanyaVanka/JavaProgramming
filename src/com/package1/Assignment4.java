package com.package1;

class Assignment3 {
    String stname;
    int stid;
    Assignment3(int stid,String stname){
        this.stid=stid;
        this.stname=stname;

    }
    public static void main(String[] args) {

        Assignment3 a=new Assignment3(1,"sachin");
        Assignment3 b=new Assignment3(2,"vasu");
        Assignment3[] c = {a,b};

        for(int i=0;i<2;i++){
            c[0]=a;
            c[1]=b;
            System.out.println(c[i]);
        }
    }

}