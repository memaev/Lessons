package org.example;

public class Singleton {

    public static Singleton INST = new Singleton();
    private int a = 5;

    private Singleton() {
        a = 6;
    }

    public static Singleton getInstance() {
        if (INST == null)
            INST = new Singleton();
        return INST;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
