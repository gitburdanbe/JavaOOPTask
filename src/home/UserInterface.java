package home;

import java.util.Scanner;

public class UserInterface {

    Scanner scan = new Scanner(System.in);

    public void showOptions(){
        System.out.println("Hello, please choose one of these options:");
        System.out.println("1. Cash In \n 2. Cash Out \n 3. Show Balance \n 4. Transfer Money");
    }

    public int takingInput(){
        return scan.nextInt();
    }

}
