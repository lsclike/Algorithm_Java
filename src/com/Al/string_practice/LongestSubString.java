package com.Al.string_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class LongestSubString {
    public static int LongestSubStringFinding(String s){
        int l = 0;
        int r = -1;
        int result = 0;
        ArrayList<Integer> result1 = new ArrayList<>();
        HashSet<Character> mapping = new HashSet<>();
        Stack<Integer> test = new Stack<>();
        test.pop();
        while ( l < s.length()){
            int tempL = l;
            if ( r + 1 < s.length() && !mapping.contains(s.charAt(r+1))){
                r += 1;
                mapping.add(s.charAt(r));
            } else {
                mapping.remove(s.charAt(l));
                l++;
            }
            if (tempL < l){
                continue;
            }
            result = r - l + 1;
        }
        return result;
    }

    public static void main(String[] args){
        String test = "avqa";
        int result = LongestSubStringFinding(test);
        System.out.print(result);
    }
}
