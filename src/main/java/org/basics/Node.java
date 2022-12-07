package org.basics;

public class Node<T> {
    private T value;
    private Node <T> next;
    private Node <T> previous;

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.next = null;
    }

    public void setValue(T value) {
        this.value = value;

    }

    public T getValue() {
        return this.value;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public Node<T> getPrevious(){
        return this.previous;
    }

    public void setNext(Node<T> value){
        this.next=value;
    }

    public void setPrevious(Node<T> value){
        this.previous=value;
    }

    public  void setLinks (Node<T> previousNode, Node<T> nextNode){
        this.setNext(nextNode);
        this.setPrevious(previousNode);

    }

}
