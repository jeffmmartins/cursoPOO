package model.service;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){

        Double minutes = (double) Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicpaymente;
        if (hours <= 12){
            basicpaymente = pricePerHour * Math.ceil(hours);
        }else {
            basicpaymente = pricePerDay * Math.ceil(hours/24.0);
        }

        double tax = TaxService.tax(basicpaymente);
        carRental.setInvoice(new Invoice(basicpaymente, tax));
    }
}
