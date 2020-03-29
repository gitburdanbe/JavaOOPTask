package com.company;

public class Child extends Parent  {

    public void sayHi(){
        System.out.println("Hi");
    }

    @Override
    public void sayHello() {
        System.out.println("AYE");
    }
}
