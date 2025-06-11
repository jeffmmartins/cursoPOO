package model.service;

import model.entities.CarRental;
import model.entities.Invoice;

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
        carRental.setInvoice(new Invoice(50.0, 10.0));
    }
}
