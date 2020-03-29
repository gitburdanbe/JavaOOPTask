package Phone;

public class SystemInformation {

    private int pin = 2312;
    private final String phoneName = "Nokia 3310";
    private String time = "23:59";

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getPhoneName() {
        return phoneName;
    }

}
