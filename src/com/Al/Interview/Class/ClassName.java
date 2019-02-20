package com.Al.Interview.Class;

public class ClassName {

    public static void main(String[] args){
        Object obj = new Object();
        Class<?> cl = obj.getClass();
        Class<?> StringArray = String[].class;
        System.out.println(cl);
        System.out.println(StringArray);
        System.out.println(cl);
        Class<?> scannCl = java.util.Scanner.class;
        System.out.println(scannCl);
    }
}
