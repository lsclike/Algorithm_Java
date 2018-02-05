package com.Al.questions.chapter1;

import com.Al.StdOut;
import edu.princeton.cs.algs4.Queue;

public class ResizeArrayQueueString {
    private Queue<String>[] test;
    private int N;
    public ResizeArrayQueueString(int cap){
        test = (Queue<String>[]) new Object[cap] ;
    }

    public boolean isEmpty(){ return N==0; }
    public int size(){
        return N;
    }

    public void push(Queue<String> last){
        if (N==test.length) {resize(2*test.length) ;}
        test[N++] = last ;
    }

    private void resize(int max){
        Queue<String>[] temp = (Queue<String>[]) new Object[max];
        for(int i = 0; i < N; i++){
            temp[i] = test[i];
        }
        test = temp;
    }

    public static void main (String[] args){
        ResizeArrayQueueString fun =  new ResizeArrayQueueString(10);
        Queue<String> N1 = new Queue<String>();
        Queue<String> N2 = new Queue<String>();
        N1.enqueue("hello");
        N2.enqueue("world");
        fun.push(N1);
        fun.push(N2);
        StdOut.print(fun.size());
    }
}
