package home;

public class CreditCard {

    private final int pin1 = 1122, pin2 = 1234;
    private final int cvc1 = 343, cvc2 = 123;
    private int balance1, balance2;

    public int getPin1() {
        return pin1;
    }

    public int getPin2() {
        return pin2;
    }

    public int getCvc1() {
        return cvc1;
    }

    public int getCvc2() {
        return cvc2;
    }

    public int getBalance1() {
        return balance1;
    }

    public void setBalance1(int balance1) {
        this.balance1 = balance1;
    }

    public int getBalance2() {
        return balance2;
    }

    public void setBalance2(int balance2) {
        this.balance2 = balance2;
    }
}
