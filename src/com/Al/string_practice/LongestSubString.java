package com.Al.string_practice;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubString {
    public static int LongestSubStringFinding(String s){
        int l = 0;
        int r = -1;
        int result = 0;
        HashSet<Character> mapping = new HashSet<>();
        while ( l < s.length()){
            int tempL = l;
            int tempR = r;
            if ( r + 1 < s.length() && !mapping.contains(s.charAt(r+1))){
                r += 1;
                mapping.add(s.charAt(r));
            } else {
                mapping.remove(s.charAt(l));
                l++;
            }
            if (tempL < l && tempR == r){
                continue;
            }
            result = Math.max(result, r - l + 1);
        }
        return result;
    }

    public static void main(String[] args){
            String test = "abcdegabgb";
        int result = LongestSubStringFinding(test);
        System.out.print(result);
    }
}
