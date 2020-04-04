package JavaOOPTask;

import java.util.Scanner;

public class Wheels {

    Scanner scanner = new Scanner(System.in);

    private String durability;
    private String name;
    private int age = 0;

    public Wheels(String durability, String name){
        this.name = scanner.nextLine();
        this.durability = scanner.nextLine();

    }

}