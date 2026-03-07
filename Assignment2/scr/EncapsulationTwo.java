import java.util.Scanner;

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

class ElectronicProduct {
    private String productId;
    private String productName;
    private int productPrice;

    public ElectronicProduct(String productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getProductPrice() {
        return this.productPrice;
    }

    public double discount(int discountPresentage) {
        System.out.println("Discount Price : " + discountPresentage);
        double discountPrice = productPrice * ((double) discountPresentage / 100);
        return discountPrice;
    }

}

class WashingMachine extends ElectronicProduct {
    private int warranty = 5;

    public WashingMachine(String productId, String productName, int productPrice) {
        super(productId, productName, productPrice);
    }

    public int getWarranty() {
        return warranty;
    }

    public int extendWarranty(int extendYear) {
        this.warranty += extendYear;
        return warranty;
    }

}