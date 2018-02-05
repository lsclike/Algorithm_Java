package com.Al;

import java.util.Iterator;



public class FixedCapacityStack<Item> implements Iterable<Item>{
    private Item[] a;
    private int N;


    public FixedCapacityStack(int cap){
       a = (Item[]) new Object[cap];
    }

    public boolean isEmpty(){
        return N==0;
    }
    public boolean isFull(){return N==a.length; }

    public int size(){ return N; }

    public void push(Item item){
        if (N == (a.length+1)) resize(2*a.length);
        a[N++] = item;
    }


    public Item pop(){
        return a[--N];
    }

    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++){
            temp[i] = a[i];
        }

        a = temp;
    }


    public Iterator<Item> iterator(){ return new ReverseArrayIterator(); }

    private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i = N;
        public boolean hasNext() {return i > 0 ;}
        public Item next() { return a[--i]; }
        public void remove() {}
    }








}
