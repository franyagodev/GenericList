package org.basics;

public class GenericList<T> {
    private Node<T> nodeIndex, nodeTail;
    private int listSize = 0;

    public GenericList() {
        this.nodeIndex = this.nodeTail = null;
        listSize = 0;
    }

    public boolean isEmpty() {

        return (this.listSize == 0);
    }

    public int length() {

        return this.listSize;
    }

    private void setListIndex(Node<T> nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    private void setListTail(Node<T> nodeTail) {
        this.nodeTail = nodeTail;
    }

    private void setLinks(Node<T> nodeIndex, Node<T> nodeTail) {
        this.setListIndex(nodeIndex);
        this.setListTail(nodeTail);
    }

    public void printListValues() {
        Node<T> auxiliarNode = this.nodeIndex;
        while (auxiliarNode != null) {
            System.out.println(auxiliarNode.getValue());
            auxiliarNode = auxiliarNode.getNext();

        }
    }


    //Appends a new node at the end of the list
    public void appendNode(T data) {

        Node<T> auxiliarNode;
        Node<T> newNode = new Node<>(data);

        if (this.isEmpty()) {
            this.setListIndex(newNode);
            this.setListTail(newNode);
            newNode.setLinks(null, null);
        } else {
            auxiliarNode = this.nodeTail;
            auxiliarNode.setNext(newNode);
            newNode.setPrevious(auxiliarNode);
            this.setListTail(newNode);
            newNode.setNext(null);
        }
        this.listSize++;

    }

    public void removeNodes() {
        this.setLinks(null, null);
        this.listSize = 0;
    }


    public void deleteNode(Node<T> node) {
        Node<T> auxiliaryNodeNext = node.getNext();
        Node<T> auxiliaryNodePrev = node.getPrevious();

        if (auxiliaryNodePrev == null && auxiliaryNodeNext == null) {
            //index node and the list contains only 1 node
            this.setLinks(null, null);
        } else if (auxiliaryNodePrev == null && auxiliaryNodeNext != null) {
            //node index and the list contains more than 1 node
            //actualizar index y tail y los enlaces

            this.setListIndex(auxiliaryNodeNext);
            node.setPrevious(null);


        } else if (auxiliaryNodePrev != null && auxiliaryNodeNext != null) {
            //node between others, there are n nodes

            auxiliaryNodePrev.setNext(auxiliaryNodeNext);
            auxiliaryNodeNext.setPrevious(auxiliaryNodePrev);
            node.setLinks(null, null);

        } else if (auxiliaryNodePrev != null && auxiliaryNodeNext == null) {
            //n nodes and you are deleting the tail one
            auxiliaryNodePrev.setNext(null);
            this.setListTail(auxiliaryNodePrev);

        }

        listSize--;

    }

    public Node<T> getNodeIndex() {
        return this.nodeIndex;
    }

}
