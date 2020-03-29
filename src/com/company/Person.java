package com.company;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(){

        System.out.println("Object constructor created new person");


    }

    String introducing(){
        return name + " " + surname + " " + age;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }


    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}