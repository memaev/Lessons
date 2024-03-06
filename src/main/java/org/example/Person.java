package org.example;

import org.example.entity.Car;

public class Person {
    private Address address;
    private Car car;


    public Person(Address address){
        this.address = address;
    }

    public Person(Address address, Car car){
        this.address = address;
        this.car = car;
    }

    public void addCar(Car car){
        this.car = car;
    }

}
