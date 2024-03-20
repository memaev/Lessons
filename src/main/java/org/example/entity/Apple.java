package org.example.entity;

public class Apple {
    private int val;

    public Apple(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Value: " + val;
    }
}
