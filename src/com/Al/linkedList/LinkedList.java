package com.Al.linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements Iterable<E> {
    private class Node{
        private E item;
        private Node next;

        private Node(E item, Node next){
            this.item = item;
            this.next = next;
        }
    }

    private Node first, last;
    private int size;

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E item){
        Node newNode = new Node(item, null);
        if (isEmpty()){
            this.first = this.last = newNode;
        }else {
            this.last.next = newNode;
            this.last = newNode;
        }
        size++;
    }

    public E removeFromTail() {
        if (isEmpty()){
            throw new NoSuchElementException("List underflow");
        }
        Node removedNode = first;
        first = first.next;
        if (first.next == null){
            this.last = null;
        }
        size--;
        return removedNode.item;
    }

    public boolean contains(E o) {
        if (isEmpty()){
            throw new NoSuchElementException("The list is empty");
        }
        while(first != null){
            if (first.item.equals(o)){
                return true;
            }
        }
        return false;
    }

    public Node peak(){
        if (isEmpty()){
            throw new NoSuchElementException("the list is underflow");
        }
        return first;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterable();
    }

    private class Iterable implements Iterator<E> {
        Node current = first;
        public boolean hasNext() {
            return current != null;
        }

        public E next(){
            if (!hasNext()){
                throw new NoSuchElementException("The list is underflow");
            }
            E returnedItem = current.item;
            current = current.next;
            return returnedItem;
        }
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        for (E item : this){
            s.append(item + " ");
        }
        return s.toString();
    }

    public void weaving(){
        Node startPoint = peak();
        for (int i = 0; i < size()/2 - 1; i++){
            Node oneHop = startPoint;
            Node twoHop = startPoint;
            while (twoHop.next.next != null){
                oneHop = oneHop.next;
                twoHop = twoHop.next.next;
            }
            twoHop = startPoint;
            Node nextNode = startPoint.next;
            Node twoBelowNode = oneHop.next.next;
            twoHop.next = oneHop.next;
            oneHop.next.next = nextNode;
            oneHop.next = twoBelowNode;
            startPoint = startPoint.next.next;
        }
    }

    public static void main(String[] args){
        LinkedList<Integer> theList = new LinkedList<>();
        theList.push(1);
        theList.push(3);
        theList.push(5);
        theList.push(7);
        theList.push(9);
        theList.push(2);
        theList.push(4);
        theList.push(6);
        theList.push(8);
        theList.push(10);
        theList.weaving();
        System.out.println(theList);
    }
}
