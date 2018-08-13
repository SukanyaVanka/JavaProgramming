package com.package1;

public class Vehicle {
    String VehicleType;

    String  BulidEngine(){
        return "engine";
    }
}
class car extends Vehicle{
    String color;
    String getcolor(){
        return "red";
    }
}
