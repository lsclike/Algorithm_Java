package com.Al;


public class Status {
    public static void main(String[] args) {

        Bag<Double> numbers = new Bag<Double>();

        while(!StdIn.isEmpty())

        {
            numbers.add(StdIn.readDouble());


        }

        int N = numbers.size();
        double sum = 0.0;
        for (double x : numbers){
            sum +=x;
        }
        double mean = sum/N;
        StdOut.printf("Mean: %.2f\n",mean);

    }

}

