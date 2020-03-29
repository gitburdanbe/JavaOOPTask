package com.company;

public class MyArrayList {

    private int[] elements;

    private int size;


    public MyArrayList(){
        this.elements = new int[10];
    }

    public MyArrayList(int capacity){
        this.elements = new int[capacity];
    }


    public void add(int element){
        if (isFull()) increaseCapacity();
        elements[size] = element;
        size++;
    }

    public void add(int...elements){
        if (isFull()) increaseCapacity();
        for (int perint : elements){
            this.add(perint);
        }
    }

    public void remove(int index){
        if (isEmpty()) throw new IllegalStateException("List is empty");

        if (index == elements.length - 1){
            elements[elements.length - 1] = 0;
        }else {

            for (int i = index; i < elements.length - 1; i++){
                elements[i] = elements[i + 1];
            }

        }


        size--;
    }


    public int getValue(int index){
        return elements[index];
    }

    private void increaseCapacity(){
        int[] temp = new int[elements.length * 2];
        for (int i = 0;i < elements.length; i++){
            temp[i] = elements[i];
        }
        elements = temp;
    }


    private boolean isEmpty(){
        return size == 0;
    }

    private boolean isFull(){
        return size == elements.length;
    }

    public int getSize() {
        return size;
    }
}