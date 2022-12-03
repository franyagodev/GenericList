package org.basics;

public class GenericList<T> {
    private Node<T> nodeIndex;
    private int listSize = 0;

    public GenericList() {
        this.nodeIndex = null;
        listSize = 0;
    }

    public boolean isEmpty() {
        return (this.listSize == 0);
    }

    public int length() {
        return this.listSize;
    }



    //Appends a new node at the end of the list
    public void appendNode(T data) {

        Node<T> aux;
        Node<T> newNode = new Node<>(data);

        if (this.isEmpty()){
            this.nodeIndex= newNode;
        }
        else{
            aux = this.nodeIndex;
            while (aux.next()!=null){
                aux=aux.next();
            }
            aux.setNext(newNode);

        }
    this.listSize++;

    }

    public void removeNodes(){
        this.nodeIndex=null;
        this.listSize=0;
    }


    public void DeleOneNode(T data) {

        Node<T> aux;
        Node<T> newNode = new Node<>(data);

        while (this.nodeIndex!=null){
            aux=this.nodeIndex.getValue();
            if(aux==data){

            }
        }

        
    }

}
