package Vehicless;

class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting Bike Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Bike Engine");
    }
}
