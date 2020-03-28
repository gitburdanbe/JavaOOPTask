package JavaOOPTask;

public class Main {

    public static void main(String[] args) {

        Car newCar = new Car("BMW", "Sedan");

        System.out.println("The number of the seats available: " + newCar.numberOfSeats);

        System.out.println("The serial number of car is: " + newCar.getSerialNumberOfCar());

        System.out.println("Information about the engine:");
        System.out.printf("    The number of the cylinders: %d \n    The maximum speed is: %d \n    The age of the engine: %d ", newCar.engine
                .getNumberOfCylinders(), newCar.engine
                .getMaxSpeed(), newCar.engine
                .getAge());

    }

}
