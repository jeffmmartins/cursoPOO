package entities;

import java.time.LocalDate;

public class Installments {

    private LocalDate date;
    private Double amount;

    public Installments(){}

    public Installments(Double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date + " - " + String.format("%.2f",amount);
    }
}
