package com.Al.questions.chapter1;

import com.Al.StdIn;
import com.Al.StdOut;
import edu.princeton.cs.algs4.Stack;

public class Inprefixtopostfix {
    public static void main(String[] args) {
        String test1 = "((A+B)*(C/D))";
        Stack<String> ops = new Stack<String>();
        Stack<String> vals = new Stack<String>();

        int t = test1.length();
        int k = 0 ;
        for (int i = 0; i < t; i++){
            char c = test1.charAt(i);
            String s = String.valueOf(c);
            if (s.equals("(")) {  ;}
            else if  (s.equals("+") ||
                      s.equals("-") ||
                      s.equals("*") ||
                      s.equals("/")) {ops.push(s);}


            else if (s.equals(")")){
                String op = ops.pop();
                String val = vals.pop();
                val = String.format("(%s %s %s)",vals.pop(),val,op);
                vals.push(val);
                k++;
            }

            else
                vals.push(s);
        }

            StdOut.print(vals.pop());

    }
}