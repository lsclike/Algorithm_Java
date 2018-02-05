package com.Al.questions.chapter1;

import edu.princeton.cs.algs4.StdOut;

public class ClientBiStackLinkedList {
    public static void main(String[] args){
        BiStackLinkedList<String> test = new BiStackLinkedList<>();
        String s = "Hello world";
        test.push("hello");
        test.push("new");
        test.push("world");
        StdOut.print(test.last());
        char c = s.charAt(1);
        String t = String.valueOf(c);
        StdOut.println(t);
        
    }
}
