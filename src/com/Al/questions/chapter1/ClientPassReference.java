package com.Al.questions.chapter1;

import com.Al.StdOut;

public class ClientPassReference {
    public static void main(String[] args){
        Test_for_passing_reference o = new Test_for_passing_reference(10,20);
        o.meth(o);
        StdOut.println(o.a);
        StdOut.println(o.b);
    }
}
