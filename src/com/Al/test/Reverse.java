package com.Al.test;


import com.Al.StdIn;
import com.Al.StdOut;
import edu.princeton.cs.algs4.Stack;

public class Reverse {
    public static void main (String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        while (!StdIn.isEmpty())
            stack.push(StdIn.readInt());

        for (int i : stack)
            StdOut.println(i);

        int N = stack.size();
        StdOut.println(N);



    }
}
