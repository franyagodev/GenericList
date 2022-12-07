package org.basics;

public class Main {
    public static void main(String[] args) {


        Node<Integer> node = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);

        GenericList<Integer> ge = new GenericList<>();

        ge.appendNode(node.getValue());
        ge.appendNode(node2.getValue());
      ge.appendNode(node3.getValue());


        System.out.println("longitud lista antes  de eliminar " + ge.length());
        ge.printListValues();

        //System.out.println("comprobacion: "  +ge.getNodeIndex().getNext().getNext().getValue());
        ge.deleteNode(ge.getNodeIndex());



        System.out.println("longitud lista despues de eliminar " + ge.length());
        ge.printListValues();


    }










}

