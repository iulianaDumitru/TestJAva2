package sda.abstractexample;

public class Car extends Vehicle {

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Car moved");
    }
}
