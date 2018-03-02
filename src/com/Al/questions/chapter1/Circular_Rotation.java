package com.Al.questions.chapter1;

import edu.princeton.cs.algs4.StdOut;

public class Circular_Rotation {
    private static boolean rotation(String t1,String t2) {
        return t1.length() == t2.length() && (t1 + t1).contains(t2);}

    public static void main(String[] args) {

        boolean result = Circular_Rotation.rotation("abcd", "bcda");
        StdOut.println(result);
    }
}

