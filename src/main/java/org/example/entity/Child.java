package org.example.entity;

public class Child extends Person {
    private String childrenGarden;

    public Child(String name, int age, int weight, int height, String childrenGarden) {
        super(name, age, weight, height);
        this.childrenGarden = childrenGarden;
    }

    public String getChildrenGarden() {
        return childrenGarden;
    }

    public void setChildrenGarden(String childrenGarden) {
        this.childrenGarden = childrenGarden;
    }
}
