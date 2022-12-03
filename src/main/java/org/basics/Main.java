package org.basics;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Node<Integer> node = new Node<>(2);
        Node<Integer> node2 = new Node<>(3);
        GenericList<Integer> ge = new GenericList<>();
        ge.appendNode(node.getValue());
        ge.appendNode(node2.getValue());
        System.out.println(ge.length());

    }










}

