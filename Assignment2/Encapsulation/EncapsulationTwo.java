import java.util.Scanner;

import Encapsulation.*;

public class EncapsulationTwo {
    public static void main(String[] args) {
        WashingMachine obj = new WashingMachine("H1010", "LG TopLoader", 15000);
        System.out.println("Product ID: " + obj.getProductId());
        System.out.println("Product Name: " + obj.getProductName());
        System.out.println("Product Price: " + obj.getProductPrice());
        System.out.println("Warranty :" + obj.getWarranty() + " years");
        System.out.println("-----------------------------------------------------");
        System.out.println("Enter the Warranty to Extend: ");
        Scanner sc = new Scanner(System.in);
        int warranty = sc.nextInt();
        System.out.println("Enter the Discount Presenter: ");
        int discountPresentage = sc.nextInt();
        double discount = obj.discount(discountPresentage);
        System.out.println("-----------------------------------------------------");
        System.out.println("Product ID: " + obj.getProductId());
        System.out.println("Product Name: " + obj.getProductName());
        System.out.println("Product Price: " + obj.getProductPrice());
        System.out.println("Warranty : " + obj.extendWarranty(warranty) + " years");
        System.out.println("Discount Price : " + discount);
        System.out.println("Final Price: " + (obj.getProductPrice() - discount));
        System.out.println("-----------------------------------------------------");
    }
}

