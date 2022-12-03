package org.basics;

public class Node<T> {
    private T value;
    private Node <T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public void setValue(T value) {
        this.value = value;

    }

    public T getValue() {
        return this.value;
    }

    public Node next(){
        return this.next;
    }

    public void setNext(Node<T> value){
        this.next=value;
    }


}
