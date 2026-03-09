package Electronic;

public class WashingMachine extends ElectronicProduct {
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
