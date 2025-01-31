package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){}

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
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

    // nesse metodo é possivel retornar em milesegundos
    public Long duration(){
        Long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff,TimeUnit.MICROSECONDS);
    }

    public void updatDates(Date checkIn, Date checkOut){
        this.checkin = checkIn;
        this.checkout = checkOut;
    }
     // metodo tostring é um sobreposição
    @Override
    public String toString(){
        return " Room "
                + roomNumber
                + ", chheckin "
                + sdf.format(checkin)
                + ", checkout "
                + sdf.format(checkout)
                + ", "
                + duration()
                + ", nights" ;
    }

}
