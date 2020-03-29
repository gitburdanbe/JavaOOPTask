package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonCalling {

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        ArrayList<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++){

            System.out.print("Enter your name: ");
            people.get(i).setName(scan.nextLine());

            System.out.print("Enter your surname: ");
            people.get(i).setSurname(scan.nextLine());

            System.out.print("Enter your age: ");
            people.get(i).setAge(scan.nextInt());

            System.out.println("Person created successfully \n");

        }

        for (int i = 0; i < people.size(); i++){ System.out.println(people.get(i).introducing()); };

        System.out.println(person1.getAge());

    }

}