package com.Al;

public class FIFOQueue<Item> {
    private Node first;
    private Node last;
    private int N;

    private class Node{
        Node next;
        Item item;
    }
    public boolean isEmpty(){ return N==0; }
    public int size(){ return N;}
    public void enqueue(Item item){
        Node oldlast = last;
        Node last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }
        else {
            oldlast.next = last;
        }
        N++;
    }
    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if(isEmpty()){ last = null; }
        N--;
        return  item;
    }
}
