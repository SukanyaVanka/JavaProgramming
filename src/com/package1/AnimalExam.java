package com.package1;

import java.util.ArrayList;
import java.util.List;

public class AnimalExam {
    public static void main(String[] args) {
        List list=new ArrayList();
        AnimalExam a=new Doggi();
        AnimalExam b=new cat();
    }
    public void print(AnimalExam a){

    }
    String getAimalType(){
      return  "animal";
    }
    String color(){
        return "color";
    }
}
class Doggi extends AnimalExam{
    String noOfLegs(){
        return"legs";
    }
}
class cat extends AnimalExam{
    String description(){
        return "desc";
    }
}
