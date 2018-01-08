package com.Al;



import java.util.Arrays;



public class probability {
    public static void main(String[] args){
        /* used for getting a input value from users
           Scanner scanner = new Scanner(System.in);
           System.out.print("type number: ");
           int input = Integer.parseInt(scanner.nextLine());
           System.out.println(input);*/

        int[] a =  {1,3,6,2,9};
        for (int number :a){
        System.out.println("number: " +number);}
        Arrays.sort(a);
        System.out.println("Sorted");
        for (int number :a) {
            System.out.println("number: "+number);

        }



        System.out.print("hello world");




    }
}

