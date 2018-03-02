package com.Al.chapter1.chapter1_5;

import com.Al.StdOut;

public class Clientquickfind {
    public static void main(String[] args){
        UN_QUICK_FIND test = new UN_QUICK_FIND(100);
        test.union(2,3);
        StdOut.print(test.connected(2,3));
    }
}
