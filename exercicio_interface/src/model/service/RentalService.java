package model.service;

import model.entities.CarRental;
import model.entities.Invoice;

import javax.net.ssl.HostnameVerifier;
import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService brazilTaxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
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

        double tax = brazilTaxService.tax(basicpaymente);
        carRental.setInvoice(new Invoice(basicpaymente, tax));
    }
}
