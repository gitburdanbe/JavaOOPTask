package Phone;

public class Main {

    public static void main(String[] args) {

        Inputs input = new Inputs();
        SystemInformation sinfo = new SystemInformation();
        HomeInterface homeInterface = new HomeInterface();

        //The code below checks whether the lock key is correct or not
        System.out.print("Enter 4-digit lock key: ");

        if (input.intInput() != sinfo.getPin()){

            for (int i = 3; i > 0; i--){
                System.out.printf("You have %d chances left. Please try again: ", i);

                if (input.intInput() == sinfo.getPin()){
                    System.out.println("Code passed successfully");
                    homeInterface.homeInterface();
                    break;
                }

                if (i == 1){ System.out.println("Access denied"); }

            }

        } else {
            System.out.println("Code passed successfully");
            homeInterface.homeInterface();
        }
    }
}
