package Model.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(Integer roomNumber, Date checkin, Date checkout){
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public Integer duration(){
        long dif = getCheckout().getTime() - getCheckin().getTime();
        return (int)(dif / (1000 * 60 * 60 * 24 ));
    }

    public void updateDates(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return "Reservation: Room " + roomNumber + ", check-in: " + sdf.format(checkin) + 
        ", check-out: " + sdf.format(checkout) + ", " + duration() + " nights.";
    }

}
