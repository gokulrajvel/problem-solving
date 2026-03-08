package Encapsulation;

public class SmartPhone {
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

