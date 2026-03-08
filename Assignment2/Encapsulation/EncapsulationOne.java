import java.util.Scanner;
import Encapsulation.*;
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
