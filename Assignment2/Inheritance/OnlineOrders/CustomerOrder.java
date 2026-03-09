package OnlineOrders;

import java.util.Date;

public class CustomerOrder {
    String orderId;
    String customerName;
    Date orderDate;

    public CustomerOrder(String orderId, String customerName, Date orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public void displayOrder(String str) {
        System.out.println(str);
        System.out.println("OrderId: \t" + orderId);
        System.out.println("Customer Name: \t" + customerName);
        System.out.println("Order Date: \t" + orderDate);
    }

}
