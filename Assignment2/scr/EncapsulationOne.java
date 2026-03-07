import java.util.Arrays;
import java.util.Scanner;

public class EncapsulationOne {
    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone();
        obj.setBrand("Motorola");
        obj.setModel("G62");
        obj.setStorageCapacity(126);
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Brand Name: \t" + obj.getBrand());
        System.out.println("Model: \t\t\t" + obj.getModel());
        System.out.println("Storage: \t\t" + obj.getStorageCapacity() + "GB");
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Enter the Storage to Increase: ");
        Scanner sc = new Scanner(System.in);
        int storage = sc.nextInt();
        obj.increaseStorageCapacity(storage);
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Brand Name: \t\t" + obj.getBrand());
        System.out.println("Model: \t\t\t\t" + obj.getModel());
        System.out.println("Updated Storage: \t" + obj.getStorageCapacity() + "GB");
        System.out.println("---------------------------------------------------------");
    }
}

class SmartPhone {
    private String brand;
    private String model;
    private int storageCapacity;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void increaseStorageCapacity(int storage) {
        this.storageCapacity += storage;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getStorageCapacity() {
        return this.storageCapacity;
    }
}
