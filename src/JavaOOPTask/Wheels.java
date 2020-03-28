package JavaOOPTask;

import java.util.Scanner;

public class Wheels {

    Scanner scanner = new Scanner(System.in);

    public String durability;
    public String name;
    public int age = 0;

    public Wheels(String durability, String name){
        this.name = scanner.nextLine();
        this.durability = scanner.nextLine();

    }

}