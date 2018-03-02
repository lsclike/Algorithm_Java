package com.Al.questions.chapter1;

public class Stopwatch {
    private final long start;

    public Stopwatch(){
        start = System.currentTimeMillis();
    }
    public double elapseTime(){
        long now = System.currentTimeMillis();
        return (now - start)/1000;
    }

    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        int[] a = new int[N];
        
    }

}
