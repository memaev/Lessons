package org.example;

import org.example.entity.Apple;

public class Container<T> {
    private T data;

    public Container(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
