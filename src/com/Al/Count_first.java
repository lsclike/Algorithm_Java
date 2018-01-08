package com.Al;

public class Count_first {
    private final String name;
    private int count;

    public Count_first(String id){
        name = id;
    }

    public void increment(){
        count++;
    }

    public int tally(){
        return count;
    }

    public String toString(){
        return count+" "+name;
    }


}
