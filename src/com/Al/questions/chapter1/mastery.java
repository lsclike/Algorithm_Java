package com.Al.questions.chapter1;

import edu.princeton.cs.algs4.StdOut;

public class mastery {
    public static String mastery(String s){
        int N = s.length();
        if (N <=1) return s;
        String a = s.substring(0,N/2);
        String b = s.substring(N/2, N);
        return mastery(a) + mastery(b);
    }

    public static void main(String[] args){
        StdOut.println(mastery.mastery("abcd"));
    }
}
