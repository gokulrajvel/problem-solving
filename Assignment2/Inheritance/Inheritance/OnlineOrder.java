package Inheritance;

import java.util.Date;

public class OnlineOrder extends CustomerOrder {
    String deliveryAddress;
    String trackingNumber;
    String trackingStatus;

    public OnlineOrder(String orderId, String customerName, Date orderDate, String deliveryAddress, String trackNumber) {
        super(orderId, customerName, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackNumber;
    }

    public int calculateDeliveryTime() {
        if (deliveryAddress.toLowerCase().contains("international")) {
            return 10;
        }
        return 3;
    }

    public void updateTrackingStatus(String newStatus) {
        this.trackingStatus = newStatus;
        System.out.println("Status updated to: " + this.trackingStatus);
    }

    @Override
    public void displayOrder(String str) {
        super.displayOrder(str);
        System.out.println("Address: \t" + deliveryAddress);
        System.out.println("Tracking: \t" + trackingNumber);
        System.out.println("Status: \t" + trackingStatus);
        System.out.println("Estimated Delivery: " + calculateDeliveryTime() + " days");
        System.out.println("--------------------------------------------------------------------");
    }
}
