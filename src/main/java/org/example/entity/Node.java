package org.example.entity;

public class Node<T, R>{
    private T value;
    private Node<R> next;

    public Node(T value, Node<R> next) {
        this.value = value;
        this.next = next;
    }
}
