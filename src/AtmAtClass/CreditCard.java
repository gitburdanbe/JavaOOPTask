package AtmAtClass;

import java.util.concurrent.ThreadLocalRandom;

public class CreditCard {

    private final long serialNumber;
    private int balance;
    private final int pin;
    private final int cvc;

    public CreditCard(){
        this.serialNumber = ThreadLocalRandom
                .current()
                .nextLong((long) Math.pow(10, 15), (long) Math.pow(10, 16) - 1);

        this.pin = ThreadLocalRandom
                .current()
                .nextInt((int) Math.pow(10, 3), (int)Math.pow(10, 4) - 1);

        this.cvc = ThreadLocalRandom
                .current()
                .nextInt((int) Math.pow(10, 2), (int) Math.pow(10, 3) - 1);

        this.balance = 0;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public int getCvc() {
        return cvc;
    }
}
