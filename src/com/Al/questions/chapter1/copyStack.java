package com.Al.questions.chapter1;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class copyStack extends Stack {
    public static Stack<String> copy(Stack<String> stack){
        Stack<String> resultStack = new Stack<String >();
        Stack<String> tempStack = new Stack<String>();
        Iterator<String> iterator = stack.iterator();
        while(iterator.hasNext()){
            tempStack.push(iterator.next());
        }
        Iterator<String> tempIterator = tempStack.iterator();
        while(tempIterator.hasNext()){
            resultStack.push(tempIterator.next());
        }

        return resultStack;
    }
    public static void main (String[] args){
        Stack<String> old = new Stack<String>();
        Stack<String> last = new Stack<String>();
        old.push("A");
        old.push("B");
        int i = old.size();

        for (String s : old) {
            StdOut.print(s);
            last.push(s);
        }
        StdOut.println("");
        for (String o: last) {
            StdOut.print(o);
        }

    }
}
