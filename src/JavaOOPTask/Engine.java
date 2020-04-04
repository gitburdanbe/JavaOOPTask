package JavaOOPTask;

import java.util.Random;

public class Engine {

    private int numberOfCylinders;
    private int maxSpeed;
    private int age = 0;

    Random rand = new Random();
    public Engine(){
        this.numberOfCylinders = 4 + rand.nextInt(4);
        this.maxSpeed = 140 + rand.nextInt(200);
        age++;
    }

    public void stopEngine(){
        System.out.println("Engine stopped");
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
