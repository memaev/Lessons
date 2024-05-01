package org.example.entity;

public class YouthVillage extends School {
    private int size;

    public YouthVillage(String name, String location, int size) {
        super(name, location);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
