package AtmAtClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Account> generatedAccounts = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Main objectForCallingMethods = new Main();

        objectForCallingMethods.greeting();

        int option = Integer.parseInt(objectForCallingMethods.takeAnStringInput());

        switch (option){
            case 1:
                String name = objectForCallingMethods.takeAnStringInput();
                String surname = objectForCallingMethods.takeAnStringInput();
                String password = objectForCallingMethods.takeAnStringInput();

                Account newAccount = new Account(name, surname, password);
                generatedAccounts.add(newAccount);
            case 2:

                //complete code here

        }

    }

    private void greeting(){
        System.out.println("Welcome");
        System.out.println("[1] Create new account");
        System.out.println("[2] Login account");
    }

    private String takeAnStringInput(){
        String input = scan.nextLine();
        return input;
    }

    public void closer(){
        scan.close();
    }



}
