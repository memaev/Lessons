package org.example.entity;

public class Elderly extends Person {
    private String house;

    public Elderly(String name, int age, int weight, int height, String house) {
        super(name, age, weight, height);
        this.house = house;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
