package Reservation;

import java.util.Scanner;

public class InheritanceTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("\t\t\tWelcome to Le Meridien");
        ResortReservation obj=new ResortReservation("HKJL78845","Gokulraj","12-03-2026","D216","Le Meridien");
        obj.displayResortReservation();
        System.out.print("Change Room No: ");
        String roomNo = sc.nextLine();
        System.out.println("\nChanged Room No: "+obj.changeRoomNumber(roomNo));
        obj.displayResortReservation();
        System.out.println("------------------------------------------------------------------------------");
        RailwaysReservation obj2=new RailwaysReservation("HKJL78845","Gokulraj","12-03-2026","45");
        obj2.displayRailwaysReservation();
        System.out.print("Change Seat No: ");
        String seatNo = sc.nextLine();
        System.out.println("\nChanged Seat No: "+ obj2.changeSeatNumber(seatNo));
        obj2.displayRailwaysReservation();
        System.out.println("------------------------------------------------------------------------------");
    }

}


