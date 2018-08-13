package com.package1;

public abstract class Animal {
    String AnimalType;

    public abstract String getAnimalType();


    int getNoOflegs(String AnimalType) {
        if (AnimalType == "wild") {

            return 4;
        } else if (AnimalType == "pet") {
            return 2;

        }
        return 1;
    }
}
  class Dog extends Animal{

     public String getAnimalType(){
         return "animals";
      }


     public static void main(String[] args){
        Animal a=new Dog();
        a.getAnimalType();
System.out.println(a.getAnimalType());

System.out.println();
 }
}
