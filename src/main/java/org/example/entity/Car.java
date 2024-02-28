package org.example.entity;

public class Car {
    private double speed, weight;
    private String name;

    public static int val = 5;

    public static void doSmth(){
        //имеем доступ только к static переменным
        System.out.println(val);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
