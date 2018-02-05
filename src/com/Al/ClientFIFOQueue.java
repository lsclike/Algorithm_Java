package com.Al;

public class ClientFIFOQueue {
    public static void main(String[] args){
        FIFOQueue s = new FIFOQueue();
        s.enqueue("hello");
        s.enqueue("world");
    }

}
