package home;

import java.util.Scanner;

public class Account extends UserInterface{

    String person1 = "Kamran", person2 = "John";
    String password1 = "12345678", password2 = "87654321";

    Scanner scan = new Scanner(System.in);

    CreditCard card = new CreditCard();


    Account(String person, String password){
        while (true){

            if (person.equals(person1) && password.equals(password1)){

                showOptions();

                if (takingInput() == 1){
                    cashIn1(scan.nextInt());
                }

                else if (takingInput() == 2){
                    cashOut1(scan.nextInt());
                }

                else if (takingInput() == 3){
                    System.out.println(card.getBalance1());
                }

                else {
                    int transferredMoney = scan.nextInt();

                    card.setBalance1(card.getBalance1() - transferredMoney);
                    card.setBalance2(card.getBalance2() + transferredMoney);

                }

            }

            else if (person.equals(person2) && password.equals(password2)){

                showOptions();

                if (takingInput() == 1){
                    cashIn2(scan.nextInt());
                }

                else if (takingInput() == 2){
                    cashOut2(scan.nextInt());
                }

                else if (takingInput() == 3){
                    card.getBalance2();
                }

                else {
                    int transferredMoney = scan.nextInt();

                    card.setBalance2(card.getBalance2() - transferredMoney);
                    card.setBalance1(card.getBalance1() + transferredMoney);

                }

            }

            else{
                System.out.println("Wrong account details");
                break;
            }
        }

    }

    public void cashIn1(int money){
        card.setBalance1(card.getBalance1() + money);
    }

    public void cashIn2(int money){
        card.setBalance2(card.getBalance2() + money);
    }

    public void cashOut1(int money){

        while (true){

            if (card.getBalance1() > money) {
                card.setBalance1(card.getBalance1() - money);
                break;
            }

            else {
                continue;
            }
        }
    }

    public void cashOut2(int money){

        while (true){

            if (card.getBalance2() > money) {
                card.setBalance2(card.getBalance2() - money);
                break;
            }

            else {
                continue;
            }
        }
    }

}