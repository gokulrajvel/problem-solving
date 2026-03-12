package Vehicless;

public class Vehicles {
    public static void main(String[] args) {
        Vehicle obj = new Car();
        obj.startEngine();
        obj.stopEngine();
        obj = new Bike();
        obj.startEngine();
        obj.stopEngine();
    }
}





