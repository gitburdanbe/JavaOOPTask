package home;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter name and password");
        Account account = new Account(scanner.nextLine(), scanner.nextLine());

    }

}
