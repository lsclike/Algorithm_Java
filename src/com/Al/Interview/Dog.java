package com.Al.Interview;

import java.util.Stack;

public class Dog extends AbstractAnimal {

    public Dog(){
        System.out.println("This is the Dog");
    }

    public String getName(int i){
        return super.getName() + " oops";
    }

    public static void main(String[] args){
        Dog dogg = new Dog();
        String falseOveriden = dogg.getName();
        String trueName =dogg.getName(3);
    }
}
