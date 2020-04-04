package JavaOOPTask;

import java.util.Random;

public class Car {

    private String brandName;
    private String type;
    private int numberOfSeats;
    private String serialNumberOfCar;

    Random random;
    SerialNumber serialNumber;
    Engine engine;
    Wheels wheels;

    public String getSerialNumberOfCar() {
        return serialNumberOfCar;
    }

    public int getNumberOfSeats() { return numberOfSeats;}

    public Car(String brandName, String type){
        this.brandName = brandName;
        this.type = type;

        this.random = new Random();
        this.serialNumber = new SerialNumber();
        this.engine = new Engine();
        this.wheels = new Wheels("Long", "Lassa");

        this.serialNumberOfCar = serialNumber.serialNumber();
        this.numberOfSeats = 1 + random.nextInt(8);


        System.out.println("New car has been created successfully");
    }

    public void driving(){
        System.out.println("Driving the car");
        engine.setAge(engine.getAge() + 1);
    }

}
