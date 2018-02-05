package com.Al.questions.chapter1;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.nio.charset.StandardCharsets;

public class QueueClientGetOneCharacter {
    public static void main(String[] args){
        int k = StdIn.readInt();
        char c ;
        String t = StdIn.readString();
        Queue<Character> test = new Queue<Character>();

        for (int n = 0; n < t.length(); n++){
            c = t.charAt(n);
            test.enqueue(c);
        }

        while (k > 1){
            test.dequeue();
            k--;
        }
        c = test.peek();
        StdOut.println(c);
    }

}
