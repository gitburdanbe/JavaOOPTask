package Phone;

import java.util.ArrayList;

public class Contacts {

    ArrayList<String> contacts = new ArrayList<>();

    void contatcsScreen(){

        Inputs input = new Inputs();
        MenuScreen menuScreen = new MenuScreen();

        System.out.println("___________________________");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|Show Contacts(1)         |");
        System.out.println("|Add Contact(2)           |");
        System.out.println("|                         |");
        System.out.println("|Menu Screen(3)           |");
        System.out.println("|                         |");
        System.out.println("|_________________________|");

        System.out.print("Type the appropriate number: ");
        int choice = input.intInput();

        switch (choice) {

            case 1:
                System.out.println(contacts);
                System.out.println("Press any positive number to return previous page");
                if (input.intInput() > 0){
                    contatcsScreen();
                }
                contatcsScreen();
                break;

            case 2:
                System.out.println("Type Name and the number with a space between");
                String contact = input.stringInput();
                contacts.add(contact);
                contatcsScreen();
                break;

            case 3:
                menuScreen.menuScreen();
                break;

            default:
                System.out.println("Wrong input. Returning home screen");
                menuScreen.menuScreen();
                break;

        }
    }

}
