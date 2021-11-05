package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.name = "Ferrari";
        car.color = "Blue";
        car.doors = 3;
        car.engineCapacity = "60000cc";

        System.out.println(car.color);
    }
}
