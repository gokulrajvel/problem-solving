package Reservation;

class ResortReservation extends Reservation{
    protected String resort;
    protected String roomNumber;
    public ResortReservation(String reservationId, String customerName, String date, String roomNumber, String resort){
        super(reservationId, customerName, date);
        this.resort = resort;
        this.roomNumber=roomNumber;
    }
    public String changeRoomNumber(String roomNumber){
        this.roomNumber=roomNumber;
        return roomNumber;
    }
    public void displayResortReservation(){
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
        System.out.println("Resort Name: "+resort);
        System.out.println("Room No: "+roomNumber);
    }
}

