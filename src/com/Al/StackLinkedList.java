package com.Al;

import java.util.NoSuchElementException;

public class StackLinkedList<Item> {
    private Node first;
    private int N;
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty() { return N==0; }
    public int size() { return N; }

    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Item peek(){
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
        }


    public void list(){
        Node test;
        for (test = first; test != null; test = test.next){
            StdOut.println(test.item);
        }
    }
}
