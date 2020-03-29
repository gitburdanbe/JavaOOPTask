package TAsk;

import java.util.Scanner;

public class TV {

    String name, model;

    boolean isSmart;

    Scanner scan = new Scanner(System.in);

    public TV(String name, String model, boolean isSmart){

        this.name = name;
        this.model = name;
        this.isSmart = isSmart;

        System.out.println("New Tv has been bought and turned on");
    }

    void showChannels(){
        System.out.println("Choose one of them: ");

        System.out.println(" [1] AzTV");
        System.out.println(" [2] ATV");
        System.out.println(" [3] Space");
        System.out.println(" [4] Xezer");
        System.out.println(" [5] Lider");

        System.out.println(" [6] CNN");
        System.out.println(" [7] Euronews");
        System.out.println(" [8] BBC");

        int input = scan.nextInt();


        switch (input){

            case 1 :
                System.out.println("AzTV is streaming now");
                break;
            case 2 :
                System.out.println("ATV is streaming now");
                break;
            case 3 :
                System.out.println("Space is streaming now");
                break;
            case 4 :
                System.out.println("Xezer is streaming now");
                break;
            case 5 :
                System.out.println("Lider is streaming now");
                break;
            case 6 :
                System.out.println("CNN is streaming now");
                break;
            case 7 :
                System.out.println("Euronews is streaming now");
                break;
            case 8 :
                System.out.println("BBC is streaming now");
                break;
        }
    }

    void web(){

        if (isSmart){

            System.out.println("Choose one of these: ");
            System.out.println("[1] Youtube");
            System.out.println("[2] Games");
            System.out.println("[3] Browser");

            int input = scan.nextInt();

            switch (input){

                case 1 :
                    System.out.println("*Watching youtube*");
                    break;
                case 2 :
                    System.out.println("*Playing games*");
                    break;
                case 3 :
                    System.out.println("*Surfing the internet*");
                    break;
            }

        }
        else {
            System.out.println("This TV is not smart, therefore, it doesn't have access to the internet");
        }

    }

    void turnOff(){
        scan.close();
        System.out.println("TV is turing off");
    }

}