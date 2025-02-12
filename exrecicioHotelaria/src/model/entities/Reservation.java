package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    // Todas as instâncias de Reservation compartilham e usam o mesmo formato de data.
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
        return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
    }

    public String updatDates(Date checkIn, Date checkOut){
        Date now = new Date()
;
        if (checkin.before(now) || checkout.before(now)){
            return "Rservation dates for update must be future dates";
        }
        if (!checkout.after(checkin)){
            return "Checkout date must be after checkin date ";
        }

        this.checkin = checkIn;
        this.checkout = checkOut;
        return null; // criterio mostrando que a operação não deu nenhum erro. pois é pra retornar uma string.
    }
     // metodo tostring é um sobreposição no tostring sempre colocar @override
    @Override
    public String toString(){
        return " Room "
                + roomNumber
                + ", chheckin "
                //É um método da classe SimpleDateFormat. Ele pega um objeto Date como entrada e retorna uma string representando a data formatada de acordo com o padrão especificado no SimpleDateFormat
                + sdf.format(checkin)
                + ", checkout "
                + sdf.format(checkout)
                + ", "
                + duration()
                + ", nights" ;
    }

}
