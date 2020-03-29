package Phone;

public class Settings {

    void settingsScreen(){

        Inputs input = new Inputs();
        MenuScreen menuScreen = new MenuScreen();
        SystemInformation sinfo = new SystemInformation();

        System.out.println("___________________________");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|Change Time(1)            ");
        System.out.println("|Change PIN(2)            |");
        System.out.println("|System Information(3)}    ");
        System.out.println("|                         |");
        System.out.println("|Menu Screen(4)           |");
        System.out.println("|_________________________|");


        System.out.print("Type the appropriate number: ");
        int choice = input.intInput();

        switch (choice) {

            case 1:
                System.out.println("Time should be typed as 'xx:xx'");
                sinfo.setTime(input.stringInput());
                System.out.println("Time changed successfully");
                settingsScreen();
                break;

            case 2:
                System.out.println("Type new PIN");
                sinfo.setPin(input.intInput());
                System.out.println("PIN changed successfully");
                settingsScreen();
                break;

            case 3:
                System.out.println(sinfo.getPin());
                System.out.println(sinfo.getPhoneName());
                settingsScreen();
                break;

            default:
                menuScreen.menuScreen();
        }
    }

}
