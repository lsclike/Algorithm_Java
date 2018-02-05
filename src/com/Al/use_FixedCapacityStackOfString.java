package com.Al;


import edu.princeton.cs.algs4.Stack;

public class use_FixedCapacityStackOfString {
    public static void main (String[] args){
        FixedCapacityStack<String> s = new FixedCapacityStack<String>(20);

        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if (!item.equals("-")){ s.push(item); }
            else if (!s.isEmpty()) StdOut.print(s.pop());
        }

        StdOut.println(s.isFull());

        for(String n : s)
        {StdOut.println(n);}
        StdOut.println("(" + s.size() + " left at stack)");


    }

}