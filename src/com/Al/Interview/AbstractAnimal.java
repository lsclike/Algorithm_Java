package com.Al.Interview;

public abstract class AbstractAnimal {
    private String name;

    //verifying whether the abstract constructor will influence child class
    //Remembering the hidden super()
    public AbstractAnimal(){
        this.name = "Abstract Dog";
        System.out.println("this is the Abstract Animal");
    }

    public String getName(){
        return this.name;
    }
}
