package Reservation;

public class Reservation{
    protected String reservationId;
    protected String customerName;
    protected String date;
    public Reservation(String reservationId, String customerName, String date){
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
    }

}

