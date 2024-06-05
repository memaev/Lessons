package org.example;

public class MyList<E> {

    private MyNode<E> head;
    private MyNode<E> last;

    public int length = 0;

    public MyList(){}

    public MyList(E[] nodes) {
        if (nodes.length == 0) return;

        head = new MyNode<>(nodes[0]);
        last = head;

        for (E node : nodes) {
            last.setNext(new MyNode<>(node));
            last = last.getNext();
        }
    }

    public void add(E newNodeVal) {
        length++;
        MyNode<E> newNode = new MyNode<>(newNodeVal);

        if (last == null) {
            head = newNode;
            last = head;
            return;
        }
        last.setNext(newNode);
        last = last.getNext();
    }

    public boolean isEmpty() {
        return (head==null);
    }

    @Override
    public String toString() {
        String string = "[ ";
        if (isEmpty()) {
            string += "]";
            return string;
        }
        MyNode<E> temp = head;
        while(temp != null) {
            string += (temp.toString()) + " ";
            temp = temp.getNext();
        }
        string += "]";
        return string;
    }
}
