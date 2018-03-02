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
        first.next = null;
        first.last = oldfirst;
        N++;
    }

//    public Item last() {
//        if (!isEmpty()){
//            if (N == 1){
//                return first.item;
//            }
//
//        }
//    }

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


