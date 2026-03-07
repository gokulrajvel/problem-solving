import java.util.Arrays;
import java.util.Scanner;

public class EncapsulationOneDemo {
    public static void main(String[] args) {
        SmartPhone1 obj = new SmartPhone1();
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
        boolean flag = false;
        while (!flag) {
            int storage = sc.nextInt();
            int[] storageArray = {16, 32, 64, 128, 256, 512, 1024};
            if (Arrays.binarySearch(storageArray, storage) >= 0) {
                obj.setStorageCapacity(storage);
                System.out.println("\n---------------------------------------------------------");
                System.out.println("Brand Name: \t\t" + obj.getBrand());
                System.out.println("Model: \t\t\t\t" + obj.getModel());
                System.out.println("Updated Storage: \t" + obj.getStorageCapacity() + "GB");
                System.out.println("---------------------------------------------------------");
                flag = true;
            } else {
                System.out.println("Invalid Storage Size Enter valid Storage Size");
                System.out.println("\n---------------------------------------------------------");
                System.out.println("Storage Capacity Available: \n" + Arrays.toString(storageArray));
                System.out.println("Enter the Storage to Increase: ");
            }
        }
    }
}

class SmartPhone1 {
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
