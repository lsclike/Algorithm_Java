package com.Al.questions.chapter1;

public class Test_for_passing_reference {
    int a;
    int b;

    public Test_for_passing_reference(int i, int j){
        a = i;
        b = j;
    }

    void meth(Test_for_passing_reference o){
        Test_for_passing_reference o1 = o;
        o1.a *=2;
        o1.b /=2;
    }
}
