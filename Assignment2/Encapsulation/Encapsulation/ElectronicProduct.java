package Encapsulation;

public class ElectronicProduct {
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

