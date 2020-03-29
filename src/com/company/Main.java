package com.company;

public class Main{

    public static void main(String[] args) {

        MyArrayList list = new MyArrayList(15);

        list.add(230);
        list.add(23);
        list.add(355);
        list.add(1, 2, 3, 4, 5 ,6 ,5);

        System.out.println(list.getSize());

        for (int i = 0; i < list.getSize(); i++){
            System.out.println(list.getValue(i));
        }

    }

}