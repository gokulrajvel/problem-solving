package OnlineOrders;

import java.util.Date;

public class InheritanceOne {
    public static void main(String[] args) {
        OnlineOrder obj = new OnlineOrder("1001", "Gokulraj", new Date(), "1/25,new BusStand, Vellore - 635653", "SUU041254GHJ001");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\t\tWelcome to OnlineOrdering Website.\n");
        obj.displayOrder("\t\t-----------Order Details-----------");
        System.out.println("\n--- Updating Status ---");
        obj.updateTrackingStatus("Out for Delivery");
    }
}

