package JavaOOPTask;

import java.util.Random;

public class Car {

    private String brandName;
    private String type;
    public int numberOfSeats;
    private String serialNumberOfCar;

    public String getSerialNumberOfCar() {
        return serialNumberOfCar;
    }


    Random random = new Random();
    SerialNumber serialNumber = new SerialNumber();
    Engine engine = new Engine();
    Wheels wheels = new Wheels("Long", "Lassa");


    public Car(String brandName, String type){
        this.brandName = brandName;
        this.type = type;
        this.serialNumberOfCar = serialNumber.serialNumber();
        this.numberOfSeats = 1 + random.nextInt(8);

        System.out.println("New car has been created successfully");
    }

    public void driving(){
        System.out.println("Driving the car");
        engine.setAge(engine.getAge() + 1);
    }

}
