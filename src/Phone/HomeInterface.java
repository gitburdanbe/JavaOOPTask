package Phone;

public class HomeInterface {

    void homeInterface(){

        Inputs input = new Inputs();
        MenuScreen menu = new MenuScreen();
        SystemInformation sinfo = new SystemInformation();

        System.out.println("___________________________");
         System.out.printf("|%s             Bakcell|\n", sinfo.getTime());
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|Call(1)           Menu(2)|");
        System.out.println("|         LOCK(3)         |");
        System.out.println("|_________________________|");

        System.out.println("Type where do you want go by the numbers shown in brackets");
        int choice = input.intInput();

        switch (choice){

            case 1:
                System.out.println("Type the number you want below:");
                System.out.println("Calling " + input.intInput());
                for (int timer = 0; timer < 1000000000; timer++) {
                    if (timer == 100000000){
                        System.out.println("Probably that person is busy. Returning home screen");
                    }
                }
                homeInterface();

            case 2:
                menu.menuScreen();
                break;


            case 3:
                System.out.println("You locked the phone successfully");
                break;

            default:
                homeInterface();
        }
    }

}
