package Reservation;

public class RailwaysReservation extends Reservation{
    protected String seatNumber;
    public RailwaysReservation(String reservationId, String customerName, String date, String seatNumber){
        super(reservationId, customerName, date);
        this.seatNumber=seatNumber;
    }
    public String changeSeatNumber(String seatNumber){
        this.seatNumber=seatNumber;
        return seatNumber;
    }
    public void displayRailwaysReservation(){
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
        System.out.println("Seat Number: "+seatNumber);
    }
}

