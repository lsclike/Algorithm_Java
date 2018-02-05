package com.Al.questions.chapter1;

import edu.princeton.cs.algs4.Stack;

public class isBalanced {
    public static boolean isBalanced(String s){
        Stack<Character> open = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            if (c=='('||c=='['||c=='{'){
                open.push(c);
            }
            else if ((c==')'&&(open.isEmpty()||open.pop()!='('))||
                    (c==']')&&(open.isEmpty()||open.pop()!='[')||
                    (c=='}')&&(open.isEmpty()||open.pop()!='{'))
                return false;

        }
        return open.isEmpty();

    }
}
