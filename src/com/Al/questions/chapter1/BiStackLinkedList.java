package com.Al.questions.chapter1;
import edu.princeton.cs.algs4.*;

public class BiStackLinkedList<Item> {
    private Node first;
    private int N;

    private class Node{
        Item item;
        Node next;
        Node last;
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

    public Item last() {
        Node oldfirst = first.next;
        oldfirst.last = first;
        Item item = oldfirst.last.item;
        return item;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public void list(){
        Node test;
        for (test = first; test != null; test = test.next){
            StdOut.println(test.item);
        }
    }
}


