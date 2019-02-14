package com.Al;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FIFOQueue<Item> implements Iterable<Item>{
    private Node first;
    private Node last;
    private int N;

    private class Node {
        private Node next;
        private Item item;

        public Node(Node next, Item item){
            this.next = next;
            this.item = item;
        }
    }

    public int size(){ return N;}
    public boolean isEmpty(){ return size()==0; }
    public void enqueue(Item item){
        Node newNode = new Node(null, item);
        if (isEmpty()){
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
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

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Item item : this){
            result.append(item + "-");
        }
        return result.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator(first);
    }

    private class ListIterator implements Iterator<Item>{
        private Node current;
        //where to start the iteration
        public ListIterator(Node startNode){ current = startNode ;}
        public boolean hasNext(){
            return current != null;
        }
        public Item next(){
            if (hasNext()){
                Item item = current.item;
                current = current.next;
                return item;
            }
            throw new NoSuchElementException();

        }
    }

    public static void main(String[] args){
        FIFOQueue<Integer> test = new FIFOQueue<>();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        Iterator testIterator = test.iterator();
        while (testIterator.hasNext()){
            System.out.println(testIterator.next());
        }
    }
}
