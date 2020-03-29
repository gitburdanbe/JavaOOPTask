package Phone;

public class MenuScreen {

    void menuScreen(){

        Inputs input = new Inputs();
        HomeInterface homeInterface = new HomeInterface();
        SystemInformation sinfo = new SystemInformation();
        Contacts contacts = new Contacts();
        Settings settings = new Settings();

        System.out.println("___________________________");
         System.out.printf("|%s             Bakcell|\n", sinfo.getTime());
        System.out.println("|                         |");
        System.out.println("|Contacts(1)              |");
        System.out.println("|Settings(2)              |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|Home Screen(3)           |");
        System.out.println("|_________________________|");

        System.out.print("Type the appropriate number: ");
                int choice = input.intInput();

                switch (choice){

                    case 1:
                contacts.contatcsScreen();
                break;

            case 2:
                settings.settingsScreen();
                break;

            case 3:
                homeInterface.homeInterface();
                break;

            default:
                System.out.println("Wrong input. Returning home screen");
                homeInterface.homeInterface();
                break;

        }

    }

}