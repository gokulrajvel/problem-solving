package Vehicless;

public class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting Car Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Car Engine");
    }
}