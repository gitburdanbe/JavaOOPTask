package com.company;

public class Humans {

    String name;
    String surname;

    int age;
    int height;
    int weight;

    public Humans(){
        System.out.println("The World Is Loading... \n Please wait...");
    }

    void eating(){
        System.out.println("Eating.....");
        weight += 1;
    }

    void sleeping(){
        System.out.println("Sleping.....");
    }

    void growth(){
        age += 1;
        height +=1;
        weight +=2;

    }

}
