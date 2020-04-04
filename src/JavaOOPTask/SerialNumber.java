package JavaOOPTask;

import java.util.Random;

public class SerialNumber {

    public SerialNumber() {
    }

    public String serialNumber() {

        Random rand = new Random();

        String chars = "QAZWSXEDCRFVTGBYHNUJMIKLOP";

        int firstPartOfSerialNumber = 10 + rand.nextInt(90);
        int thirdPartOfSerialNumber = 100 + rand.nextInt(900);

        char firstletter = chars.charAt(rand.nextInt(chars.length()));
        char secondLetter = chars.charAt(rand.nextInt(chars.length()));

        String serialNum = new StringBuilder()
                .append(firstPartOfSerialNumber)
                .append(firstletter)
                .append(secondLetter)
                .append(thirdPartOfSerialNumber)
                .toString();

        return serialNum;
    }


}